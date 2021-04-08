package com.example.oop.basics.Inheritance.abstract_classes;

public class Employee extends Person{
    @Override
    public void printInfo() {
        System.out.println("Employee: " + this.getName());
    }

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }
}
