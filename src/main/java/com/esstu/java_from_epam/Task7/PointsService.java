package com.esstu.java_from_epam.Task7;

import java.util.Comparator;
import java.util.List;

public class PointsService {
    //Метод нахождения расстояния до начала координат
    //Расстояние от начала координат до точки с координатами (x, y) равно корню из суммы квадратов координат.
    public static double getDistance(Point p) {
        return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());
    }

    public static List<Point> sortPointByDistance(List<Point> points) {
        points.sort(Comparator.comparingDouble(PointsService::getDistance));
        return points;
    }
}
