package com.esstu.java_from_epam.Task9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FileNumsProcessor {

    public static List<Double> readFile(String path) throws NewException{
        List<Double> numbers = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            for (String line: lines) {
                double num = processLine(line);
                numbers.add(num);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: "+ e.getMessage());
        }
        return numbers;
    }

    private static double processLine(String line) {
        double value = 0.0;
        try {
            String[] parts = line.split(",");
            if (parts.length != 2) {
                throw new NewException("Некорректная запись в строке: " + line);
            }
            Locale parsedLocale = Locale.forLanguageTag(parts[1].trim());
            boolean localeExists=false;
            for(Locale locale : Locale.getAvailableLocales()) {
                if(locale.getLanguage().equals(parsedLocale.getLanguage())) {
                    localeExists=true;
                }
            }
            if(!localeExists){
                throw new NewException("Локаль не существует: " + line);
            }
            NumberFormat numFormat = NumberFormat.getInstance(parsedLocale);
            value = numFormat.parse(parts[0].trim()).doubleValue();
        } catch (ParseException e) {
            System.err.println("Ошибка чтения в строке: " + line + ". Текст ошибки: " + e.getMessage());
        } catch (NewException e) {
            System.err.println(e.getMessage());
        } catch (IllegalArgumentException e) {
           System.err.println("Ошибка в строке: " + line + " Текст ошибки: " + e.getMessage());
        }
        return value;
    }

    public static double calculateSum(List<Double> nums) {
        double sum = 0.0;
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }

}
