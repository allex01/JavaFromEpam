package com.esstu.java_from_epam.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Метод для поиска корней
    public List<Double> findRoots() {
        List<Double> roots = new ArrayList<>();
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            roots.add(x1);
            roots.add(x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            roots.add(x);
        }
        return roots;
    }

    //Метод для поиска экстремума
    public String findExtremum() {
        double highPoint = -b / (2 * a);
        String extremum = (a > 0) ? "Минимум" : "Максимум";
        return String.format("%s в точке x = %.2f", extremum, highPoint);
    }
    
    //Метод для вывода интервалов возрастания и убывания
    public String getIntervals() {
        double highPoint = -b / (2 * a);
        if (a > 0) {
            return String.format("Убывает на (-oo,  %.2f), возрастает на (%.2f, +oo)",highPoint,highPoint);
        } else {
            return String.format("Возрастает на (-oo, %.2f), убывает на (%.2f, +oo)",highPoint,highPoint);
        }
    }

    @Override
    public String toString(){
        return  a + "x^2 + " + b + "x + " + c + " = 0";
    }
}