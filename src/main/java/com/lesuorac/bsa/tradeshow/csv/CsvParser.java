package com.lesuorac.bsa.tradeshow.csv;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvParser {

	public static final CsvParser INSTANCE = new CsvParser();

	public final <T> List<T> readRecords(Class<T> clazz, InputStream stream) throws IOException {
		return readRecords(clazz, new InputStreamReader(stream));
	}

	@NotNull
	public Optional<Method> getSetter(Class<?> clazz, String fieldName, Class<?> fieldClass) {
		return Arrays.stream(clazz.getMethods()).filter(m -> m.getName().equalsIgnoreCase("set" + fieldName))
				.filter(m -> m.getParameterTypes().length == 1).filter(m -> m.getParameterTypes()[0].equals(fieldClass))
				.findFirst();
	}

	@NotNull
	public Optional<Method> getGetter(Class<?> clazz, String fieldName, Class<?> fieldClass) {
		return Arrays.stream(clazz.getMethods()).filter(m -> m.getName().equalsIgnoreCase("get" + fieldName))
				.filter(m -> m.getParameterTypes().length == 0).filter(m -> m.getReturnType().equals(fieldClass))
				.findFirst();
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

				getSetter(item.getClass(), field.getName(), String.class).ifPresentOrElse(m -> {
					try {
						m.invoke(item, value);
					} catch (Exception e) {
						supressedExceptions.add(e);
					}
				}, () -> supressedExceptions.add(new IllegalArgumentException(field.getName())));

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
