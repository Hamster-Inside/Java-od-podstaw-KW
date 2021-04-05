package com.example.obiekty.Inheritance.example2_shop;

public class Keyboard extends Product {
    int numKeys;

    Keyboard() {
        numKeys = 104;
    }

    Keyboard(int numKeys) {
        this();
        this.numKeys = numKeys;
    }
}
