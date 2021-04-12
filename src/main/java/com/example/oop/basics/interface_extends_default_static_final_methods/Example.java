package com.example.oop.basics.interface_extends_default_static_final_methods;

public class Example {
    public static void main(String[] args) {
Parrot parrot = new Parrot();
        parrot.flyHigher();
        System.out.println(parrot.getName());
        parrot.searchForFood();
        parrot.hunt();
        System.out.println(parrot.getDefaultWingspan());
        System.out.println("Default number of wings: " + Flying.getDefaultNumWings());
    }
}
