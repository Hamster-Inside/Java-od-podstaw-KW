package com.example.obiekty.Inheritance.example2_shop;

public class Mouse extends Product {
    int numButtons;

    Mouse() {
        numButtons = 3;
    }

    Mouse(int numButtons) {
        this();
        this.numButtons = numButtons;
    }
}
