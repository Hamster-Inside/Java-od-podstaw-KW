package com.example.oop.basics.interface_basics;

public class Plane implements Vehicle,Flying{
    @Override
    public void move() {
        System.out.println("Plane is moving");
    }

    @Override
    public void stop() {
        System.out.println("Plane Stop");
    }

    @Override
    public void turn() {
        System.out.println("Plane turn");
    }

    @Override
    public float getTopSpeed() {
        return 1000;
    }

    @Override
    public void increaseHeight() {
        System.out.println("Plane is increasing height");
    }

    @Override
    public void decreaseHeight() {
        System.out.println("Plane is decreasing Height");
    }
}
