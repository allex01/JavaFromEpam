package com.esstu.java_from_epam.Task8;

/*
    Вариант 15
    Напечатать квитанцию об оплате телеграммы, если стоимость одного слова
    задана.
 */

public class Task8App {
    public static void main(String[] args) {
        String telegram = "Hello, world! This,is a test telegram....";
        double costPerWord = 1.5;
        StringBuilder paymentReceipt = new StringBuilder();
        paymentReceipt.append("Квитанция об оплате телеграммы:\n");
        paymentReceipt.append("Текст телеграммы: ").append(telegram).append("\n");
        paymentReceipt.append("Стоимость одного слова: ").append(costPerWord).append("\n");
        paymentReceipt.append("Общая стоимость телеграммы: ").append(TextCostCalculator.calculateCost(telegram, costPerWord)).append("\n");
        System.out.println(paymentReceipt.toString());


    }
}
