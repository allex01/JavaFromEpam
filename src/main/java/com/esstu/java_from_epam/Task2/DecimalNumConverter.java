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

     // Метод для преобразования числа из другой системы счисления в десятичное
    public static int convertFromBase(String number, int base) {
        int result = 0;
        number = number.toUpperCase();     
        for (char c : number.toCharArray()) {
            if(!Character.isDigit(c)){
                int digit = c - 'A' + 10;
                result = result * base + digit;
            }else{
                int digit = Integer.parseInt(String.valueOf(c));
                result = result * base + digit; 
            }
            
        }
        return result;
    }
}
