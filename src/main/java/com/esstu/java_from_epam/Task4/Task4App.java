package com.esstu.java_from_epam.Task4;

/*  
    Вариаент 15
    Создать объект класса Дом, используя классы Окно, Дверь. Методы: за-
    крыть на ключ, вывести на консоль количество окон, дверей. 
*/
public class Task4App {
    public static void main(String[] args) {
        House house = new House(); 
        house.addDoor(80, 210);
        house.addWindow(80,110);
        house.addWindow(90,120);
        System.out.println(house.toString());
        System.out.println("\nИзменим состояние дверей и параметры окна:\n");
        //Изменим состояние дверей и параметры окна
        house.lockDoors();
        house.setWindow(0, 120, 100);
        System.out.println(house.toString());
        house.printDoorsAndWindowsCount();
    }
}