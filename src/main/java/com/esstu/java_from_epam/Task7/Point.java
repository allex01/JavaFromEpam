package com.esstu.java_from_epam.Task7;

public class Point {
    final double  x;
    final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    @Override
    public String toString() {
        String point = String.format("(%.2f:%.2f)", this.x,this.y);
        return point;
    }
}
