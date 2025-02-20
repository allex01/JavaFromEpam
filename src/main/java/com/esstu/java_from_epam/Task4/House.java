package com.esstu.java_from_epam.Task4;
import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Window> windows;
    private List<Door> doors;

    public House(){
        windows = new ArrayList<>();
        doors = new ArrayList<>();
    }

    public void addWindow(int width, int height){
        windows.add(new Window(width, height));
    }

    public void addDoor(int width, int height){
        doors.add(new Door(width, height));
    }

    public Window getWindow(int index){
        if (index >= 0 && index < windows.size()) {
            return (windows.get(index));
        } else {
            return null;
        }
    }

    public void setWindow(int index, int width, int height){
        if (index >= 0 && index < windows.size()) {
            windows.get(index).setWidth(width);
            windows.get(index).setHeight(height);
        } else {
            return;
        }
    }

    public Door getDoor(int index){
        if (index >= 0 && index < doors.size()) {
            return (doors.get(index));
        } else {
            return null;
        }
    }

    public void setDoor(int index, int width, int height){
        if (index >= 0 && index < doors.size()) {
            doors.get(index).setWidth(width);
            doors.get(index).setHeight(height);
        } else {
            return;
        }
    }

    
    public void lockDoors(){
        for(Door door: doors){
            door.lock();
        }
    }

    public void unlockDoors(){
        for(Door door: doors){
            door.unlock();
        }
    }

    public void printDoorsAndWindowsCount(){
        System.out.println("Количество окон: " + windows.size());
        System.out.println("Количество дверей: " + doors.size()); 
    }

    @Override
    public String toString(){
        String houseStr = "Дом\n[\n" + "   Окна\n   { \n";
        for(Window window:windows){
            houseStr += "       " + window.toString() + "\n";
        }
        houseStr += "   }\n   Двери\n   {\n";
        for(Door door:doors){
            houseStr += "       " + door.toString() + "\n";
        }
         houseStr += "   }\n]";
        return houseStr;
    }
}
