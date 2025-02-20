package com.esstu.java_from_epam.Task7;

import java.util.LinkedList;
import java.util.List;

public class Task7App {
    /*
        Вариант 15
        Создать N пар значений x, y, которые представляют координаты точки на плоскости. 
        Выстроить все точки по увеличению их удаленности от начала координат, 
        и вывести отсортированный список точек на экран в формате: (X:Y).
     */
    public static void main(String[] args) {
        List<Point> points = new LinkedList<>();
        for(int i = 0; i < 5; i++){
            points.add(new Point(Math.random()*100,Math.random()*100));
        }
        System.out.println("Точки:\n");
        for(Point point:points){
            System.out.println(point.toString());
        }

        System.out.println("\nТочки отсортированные по удаленности от начала координат:\n");
        PointsService.sortPointByDistance(points);
        for(Point point:points){
            System.out.println(point.toString());
        }
    }
}
