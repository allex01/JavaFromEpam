package com.esstu.java_from_epam.Task2;

public class DecimalNumConverter {
    // Метод для преобразования десятичного числа в число с другим основанием системы счисления
    public static String convertToBase(int decimalNumber, int base){
        StringBuilder result = new StringBuilder();
        //Применяется базовый алгоритм для преобразования десятичного числа в число с другим основанием системы счисления
        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            if(remainder >= 10){
                result.append((char)('A' + remainder - 10)); // Для оснований больше 9 
            }else{
                result.append(remainder); // Для оснований меньше 9 
            }
            decimalNumber /= base;
        }
        return result.length() == 0 ? "0" : result.reverse().toString();
    }
}
