package com.example.oop.basics.Inheritance.example2_shop;

public class Computer extends Product {

    public Monitor monitor;
    public Mouse mouse;
    public Keyboard keyboard;
    Computer(){
    mouse = new Mouse();
    keyboard = new Keyboard();
    monitor = new Monitor();
    }
    Computer(Monitor monitor, Keyboard keyboard, Mouse mouse){
        this();
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

}
