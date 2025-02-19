package com.esstu.java_from_epam.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/* 
    Вариант 15 (Часть В, Задание 3) 
    Определить класс Квадратное уравнение. Реализовать методы для поиска
    корней, экстремумов, а также интервалов убывания/возрастания. Создать
    массив/список/множество объектов и определить наибольшие и наимень-
    шие по значению корни.
*/
public class Task3App {
    public static void main(String[] args) {
        List<QuadraticEquation> equations = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<3; i++) {
            equations.add(new QuadraticEquation(random.nextInt(100+100+1)-100, random.nextInt(100+100+1)-100, random.nextInt(100+100+1)-100));
        }
        System.out.println("Уравнения:");
        for(QuadraticEquation equation : equations) {
            System.out.print("\n" + equation.toString() + ' ' + equation.findExtremum() + ' ' + equation.getIntervals());
            System.out.print(" Корни: "); 
            if(equation.findRoots().size() > 0){
                equation.findRoots().forEach(root -> System.out.printf("%.2f  ", root));
            }else{
                System.out.print("Корней нет");
            }
            
        }
        
        List<Double> roots = new ArrayList<Double>();
        for(QuadraticEquation equation : equations) {
            roots.addAll(equation.findRoots());
        }
        double maxRoot = roots.stream().max(Double::compare).orElse(0.0);
        double minRoot = roots.stream().min(Double::compare).orElse(0.0);
        System.out.println(String.format("\nНаибольший корень: %.2f", maxRoot));
        System.out.println(String.format("Наименьший корень: %.2f", minRoot));
    }
    
}
;