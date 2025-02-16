package com.esstu.java_from_epam.Task1;

import java.util.HashSet;
import java.util.Scanner;

/* В данной задаче необходимо ввести n целых чисел. Среди них определить "счастливые числа". */

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + " число: ");
            array[i] = scanner.nextInt();
        }

        for(int i:array){
            if(isHappyNumber(i)){
                System.out.println(i+" - счастливое число");
            }
        }
        scanner.close();
    }

    /*Счастливое число" - это число, которое при суммировании квадратов его цифр в цикле до тех пор,
    пока не получится однозначное число, в конечном итоге приводит к числу 1. 
    Если в этом цикле сумма квадратов повторилась, значит число не счастливое*/
    public static boolean isHappyNumber(int number) {
        HashSet<Integer> set = new HashSet<Integer>();
        int squareSum = number;
        set.add(squareSum);
        while (squareSum != 1) {
            squareSum = sumSquares(squareSum);
            if (set.contains(squareSum)) {
                return false;
            }
            set.add(squareSum);
        }
        return true;
    }

    public static int sumSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}