package com.esstu.java_from_epam.Task10;
import java.util.Scanner;
/*
    Вариант 15 (Часть С, задание 6)
    Файл содержит символы, слова, целые числа и числа с плавающей запятой.
    Определить все данные, тип которых вводится из командной строки.
 */
public class Task10App {
    public static void main(String[] args) throws Exception {
        String inputFilePath = "src\\main\\resources\\Task10\\input.txt";
        String outputFilePath = "src\\main\\resources\\Task10\\output.txt";

        Scanner input  = new Scanner(System.in);
        System.out.println("Введите типы данных, которые вы хотите записать в файл \n (Поддерживаются word, int, float, char)");
        String[] types = input.nextLine().split("\\s*,\\s*");
        FileTypesProcessor processor = new FileTypesProcessor(inputFilePath, outputFilePath);
        processor.setTargetTypes(types);
        processor.process();
        System.out.println("Обработка завершена");
    }

}
