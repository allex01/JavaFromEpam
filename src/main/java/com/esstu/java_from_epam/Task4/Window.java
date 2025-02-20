package com.esstu.java_from_epam.Task4;

public class Window {
    private int width;
    private int height;

    public Window(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Окно: ширина = " + this.width + ", высота = " + this.height;
    }
}
