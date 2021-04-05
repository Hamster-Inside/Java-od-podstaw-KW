package com.example.obiekty.Inheritance.example1;

public class Car extends Vehicle {

    Car(){
        this.type = "car";
        this.manufacturer = "Toyota";
        this.topSpeed = 200f;
    }
    Car (String manufacturer, float topSpeed){
        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }



}
