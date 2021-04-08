package com.example.oop.basics.methods;


class PlaneWithStatic {
    static int nextId = 1;
    int id;
    int x, y;

    static int getNextId() {
        return nextId++;
    }

    PlaneWithStatic() {
        id = nextId;
        nextId++;
    }
}


public class StaticExample {
    public static void main(String[] args) {
        System.out.println("PlaneWithStatic.nextId = " + PlaneWithStatic.nextId);
        PlaneWithStatic plane1 = new PlaneWithStatic();
        System.out.println("plane1.nextId = " + plane1.id);
        PlaneWithStatic plane2 = new PlaneWithStatic();
        System.out.println("plane2.nextId = " + plane2.id);
        PlaneWithStatic plane3 = new PlaneWithStatic();
        System.out.println("plane3.nextId = " + plane3.id);

        plane2.nextId = 7;


    }
}
