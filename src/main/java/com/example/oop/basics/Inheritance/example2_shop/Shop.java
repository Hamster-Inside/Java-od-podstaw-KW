package com.example.oop.basics.Inheritance.example2_shop;


/*

klasa Shop
klasa Product (zmienne: price, name,  manufacturer, productionYear
klasa Mouse extends Product(zmienne: numButtons = 3)
    klasa VerticalMouse extends Mouse()
klasa Monitor extends Product(zmienne: resolution = 1080)
klasa Keyboard extends Product (zmienne: numKeys = 104)
klasa Computer extends Product (zmienne: mouse, monitor, keyboard)


dodajemy pusty konstruktor do każdej klasy, ustawiamy dla nich pola danej klasy
Tworzymy egzemplarze klas w metodzie main
Każda klasa w oddzielnym pliku java
 */


public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Computer computer = new Computer();
        VerticalMouse verticalMouse = new VerticalMouse();
        computer.monitor.price = 50;
        System.out.println(computer.monitor.resolution);
        System.out.println(computer.monitor.price);
        System.out.println(computer.keyboard.price == keyboard.price);
    }
}
