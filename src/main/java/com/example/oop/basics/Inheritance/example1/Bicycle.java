package com.example.oop.basics.Inheritance.example1;

public class Bicycle extends Vehicle{
    Bicycle(){
        //super(); - dodane automatycznie
        type = "Bicycle";
        manufacturer = "Romet";
        topSpeed = 15.0f;
    }
}
