package com.esstu.java_from_epam.Task4;

public class Door {
    private boolean isLocked;
    private int width;
    private int height;

    public Door(int width, int height){
        this.isLocked = false;
        this.width = width;
        this.height = height;
    }

    protected void lock(){
        this.isLocked = true;
    }

    protected void unlock(){
        this.isLocked = false;
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
    public String toString(){
        return "Дверь: ширина = " + this.width + ", высота = " + this.height  + (this.isLocked ? ", заперта" : ", не заперта");
    }

}
