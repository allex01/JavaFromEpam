package com.esstu.java_from_epam.Task10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FileTypesProcessor {
    private String inputFilePath;
    private String outputFilePath;
    private Set<String> targetTypes = new HashSet<>();

    public FileTypesProcessor(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }
    public void setTargetTypes(String[] types) {
        targetTypes.clear();
        for (String type : types) {
            String normalizedType = type.trim();
            if (!isValidType(normalizedType)) {
                throw new IllegalArgumentException("Недопустимый тип: " + type);
            }
            targetTypes.add(normalizedType);
        }
    }

    public void process() throws IOException {
        if (targetTypes.isEmpty()) {
            throw new IllegalStateException("Не заданы типы для фильтрации");
        }
        this.validateInputFile(inputFilePath);
        File outputFile = new File(outputFilePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            Files.lines(Path.of(inputFilePath))
                .flatMap(line -> Arrays.stream(line.split("[, \\t]+")))
                .filter(element -> !element.isEmpty())
                .filter(this::isTargetType)
                .forEach(element -> writeElement(writer, element));
        }
    }

    private Path validateInputFile(String path) throws FileNotFoundException {
        Path file = Path.of(path);
        if (!Files.exists(file)) {
            throw new FileNotFoundException("Файл не найден: " + path);
        }
        return file;
    }

    private boolean isValidType(String type) {
        return Set.of("char", "word", "int", "float").contains(type);
    }

    private boolean isTargetType(String element) {
        return targetTypes.contains(determineType(element));
    }

    private String determineType(String element) {
        if (element.length() == 1 && !Character.isDigit(element.charAt(0))) {
            return "char";
        } else if (element.matches("[а-яА-ЯёЁa-zA-Z]+")) {
            return "word";
        } else if (element.matches("-?\\d+")) {
            return "int";
        } else if (element.matches("-?\\d+\\.\\d+([eE][+-]?\\d+)?")) {
            return "float";
        }
        return "unknown";
    }

    private void writeElement(BufferedWriter writer, String element) {
        try {
            writer.write(element);
            writer.newLine();
        } catch (IOException e) {
            throw new UncheckedIOException("Ошибка записи элемента: " + element, e);
        }
    }

}
