package com.example.obiekty.Inheritance.example2_shop;

public class Monitor extends Product {
    int resolution;

    Monitor() {
        resolution = 1080;
    }

    Monitor(int resolution) {
        this();
        this.resolution = resolution;
    }
}
