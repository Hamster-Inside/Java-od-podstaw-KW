package com.example.oop.basics.interface_extends_default_static_final_methods;

public class Parrot implements Bird{
    @Override
    public int getNumLegs() {
        return 2;
    }

    @Override
    public String getName() {
        return "Parrot";
    }

    @Override
    public void eat() {
        System.out.println("parrot eating");
    }

    @Override
    public void fly() {
        System.out.println("parrot flying");
    }

    @Override
    public void hunt() {
        System.out.println("hunting");
    }

    @Override
    public void searchForFood() {
        System.out.println("parrot searching for food");
    }
}
