package com.esstu.java_from_epam.Task5;


/*
    Вариант 15. 
    Создать класс Computer с внутренним классом, с помощью объектов кото-
    рого можно хранить информацию об операционной системе, процессоре
    и оперативной памяти.
 */
public class Task5App {
    public static void main(String[] args) {
        Computer.SystemSpecs  syspecs1 = new Computer.SystemSpecs("Windows 10", "Intel i7", 16);
        System.out.println(syspecs1.toString());
    }
}
