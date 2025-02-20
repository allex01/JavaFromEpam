package com.esstu.java_from_epam.Task2;
import java.util.Scanner;
/* 
    Вариант 15 (Часть Б, Задание 6) 
    В системе счисления с некоторым основанием десятичное число 81 записывается в виде 100. Найти это основание 
*/
public class Task2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите десятичное число: ");
        int decimalNumber = Integer.parseInt(input.nextLine());
        System.out.println("Введите это число в другой системе счисления: ");
        String anotherSystemNumber = input.nextLine();
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
            int decimalNewValue = DecimalNumConverter.convertFromBase(newValue, base);
            if(decimalNewValue > decimalNumber){
                return -1; // Прервать цикл если число в новом основании больше изначального десятичного(значит нужного десятичного уже не будет)
            }
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
