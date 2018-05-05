package com.lesuorac.bsa.tradeshow.csv;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvParser {
	
	public static final CsvParser INSTANCE = new CsvParser();
	
	public final <T> List<T> readRecords(Class<T> clazz, InputStream stream) throws IOException {
		return readRecords(clazz, new InputStreamReader(stream));
	}
	
	public final <T> List<T> readRecords(Class<T> clazz, Reader reader) throws IOException {
		List<Exception> supressedExceptions = new ArrayList<>();
		List<T> items = new ArrayList<>();

		Iterable<CSVRecord> csvRecords = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(reader);
		for (CSVRecord csvRecord : csvRecords) {
			T item;
			try {
				item = clazz.getConstructor().newInstance();
			} catch (Exception e) {
				supressedExceptions.add(e);
				continue;
			}

			for (Field field : item.getClass().getDeclaredFields()) {
				CsvColumn csvColumn = field.getAnnotation(CsvColumn.class);

				if (csvColumn == null) {
					continue;
				}

				String value;
				try {
					value = csvRecord.get(csvColumn.name());
				} catch (Exception e) {
					supressedExceptions.add(e);
					continue;
				}

				boolean originallyAccessible = field.canAccess(item);

				try {
					field.setAccessible(true);
					field.set(item, value);
				} catch (Exception e) {
					supressedExceptions.add(e);
				} finally {
					field.setAccessible(originallyAccessible);
				}
			}

			items.add(item);
		}

		if (!supressedExceptions.isEmpty()) {
			IOException ioe = new IOException("Failed to read file");
			supressedExceptions.forEach(ioe::addSuppressed);

			throw ioe;
		}

		return items;
	}
}
