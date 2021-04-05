package com.example.obiekty.Inheritance.example1;

public class Vehicle {

    public String type;
    public String manufacturer;
    public float topSpeed;

    Vehicle(){
        type = "uknown";
        manufacturer = "unknown";
        topSpeed = 0;
    }
    public void printInfo(){
        System.out.println("Type: " + type + "\n" +
                            "Manufacturer: " + manufacturer + "\n" +
                            "Top Speed: " + topSpeed + "\n");
    }

}
