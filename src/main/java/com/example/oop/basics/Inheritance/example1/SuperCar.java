package com.example.oop.basics.Inheritance.example1;

public class SuperCar extends Car{
SuperCar(){
    type = "Super Car";
    topSpeed = 300.0f;
}
public void setSportMode(){
    System.out.println("Sport mode on");
}
}
