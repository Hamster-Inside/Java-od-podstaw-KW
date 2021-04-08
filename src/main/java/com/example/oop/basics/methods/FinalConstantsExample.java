package com.example.oop.basics.methods;

class PointWithConstants {
    int x, y;
    final int width = 12;
    final int height;

    PointWithConstants() {
        height = 20;
    }

    PointWithConstants(int posX, int posY) {
        this();
        x = posX;
        y = posY;
    }

    public void changePosition(final int newX, final int newY) {
        x = newX;
        y = newY;
    }

}


public class FinalConstantsExample {
    public static void main(String[] args) {
        PointWithConstants point = new PointWithConstants(33, 44);
        point.changePosition(55,66);
        point.changePosition(10,5);
        System.out.println("Punkt x= " + point.x + " Punkt y= " + point.y);
    }
}
