package com.lesuorac.bsa.tradeshow.controllers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.csv.CSVFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lesuorac.bsa.tradeshow.config.TradeshowConfig;
import com.lesuorac.bsa.tradeshow.csv.CsvColumn;
import com.lesuorac.bsa.tradeshow.csv.CsvParser;
import com.lesuorac.bsa.tradeshow.models.BsaRecord;

@RestController
@RequestMapping(path = "tradeshow")
public class TradeshowController {

	private Logger log = LoggerFactory.getLogger(TradeshowController.class);

	@Autowired
	private TradeshowConfig tradeshowConfig;

	@RequestMapping(path = "test", method = { RequestMethod.GET })
	public List<BsaRecord> testRecords() {
		return new ArrayList<>();
	}

	@RequestMapping(path = "", method = { RequestMethod.POST })
	public ResponseEntity<Resource> handleFileUpload(@RequestParam("file") MultipartFile file,
			RedirectAttributes redirectAttributes) throws IOException {

		List<BsaRecord> bsaRecords;
		try {
			bsaRecords = CsvParser.INSTANCE.readRecords(BsaRecord.class, file.getInputStream());
		} catch (IOException e) {
			log.error("Unable to read records", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

		// https://stackoverflow.com/a/36887667/1991577
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ZipOutputStream zos = new ZipOutputStream(baos);

		for (Map.Entry<String, List<String>> view : tradeshowConfig.getViews().entrySet()) {
			String name = view.getKey();
			List<String> columns = view.getValue();

			zos.putNextEntry(new ZipEntry(name));
			OutputStreamWriter osw = new OutputStreamWriter(zos, Charset.defaultCharset());

			CSVFormat.RFC4180.withHeader(columns.toArray(new String[columns.size()])).print(osw);
			for (BsaRecord bsaRecord : bsaRecords) {
				Object[] values = new String[columns.size()];
				for (int i = 0; i < values.length; i++) {
					values[i] = "?";
					Field field = getField(columns.get(i));

					if (field == null) {
						log.warn("Unable to updated field [{}]", columns.get(i));
						continue;
					}

					final int index = i;
					CsvParser.INSTANCE.getGetter(bsaRecord.getClass(), field.getName(), String.class)
							.ifPresentOrElse(m -> {
								try {
									values[index] = m.invoke(bsaRecord);
								} catch (Exception e) {
									log.error("Unable to handle field [{}]", field, e);
								}
							}, () -> log.error("Unable to handle field [{}]", field));

				}

				CSVFormat.RFC4180.printRecord(osw, values);
			}

			osw.flush();
			zos.closeEntry();

		}
		zos.close();
		// ??? baos.close();

		redirectAttributes.addFlashAttribute("message",
				"You successfully uploaded " + file.getOriginalFilename() + "!");

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"views.zip\"")
				.body(new ByteArrayResource(baos.toByteArray(), "views.zip"));
	}

	private Field getField(String csvName) {
		for (Field field : BsaRecord.class.getDeclaredFields()) {
			CsvColumn csvColumn = field.getAnnotation(CsvColumn.class);
			if (csvColumn != null && csvName.equals(csvColumn.name())) {

				return field;
			}
		}

		return null;
	}
}
