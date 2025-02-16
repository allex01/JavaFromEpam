package com.esstu.java_from_epam.Task2;
import com.esstu.java_from_epam.Task2.DecimalNumConverter;

/* 
    Вариант 15 (Часть Б, Задание 6) 
    В системе счисления с некоторым основанием десятичное число 81 записывается в виде 100. Найти это основание 
*/
public class Task2 {
    public static void main(String[] args){
        int decimalNumber = 81;
        String anotherSystemNumber = "100";
        int base = findSystemBase(decimalNumber, anotherSystemNumber);
        if(base!=-1){
            System.out.println("Основание системы счисления: " + base);
        }else{
            System.out.println("Такого основания не существует");
        }
    }

    public static int findSystemBase(int decimalNumber, String anotherSystemNumber){
        int base = 2;
        while (true) {
            String newValue = DecimalNumConverter.convertToBase(decimalNumber, base);
            if(newValue.equals(anotherSystemNumber)){
                return base; 
            }
            base++;
            if(base>36){
                return -1; // Основание не может быть больше 36
            }
        }
    }

}
