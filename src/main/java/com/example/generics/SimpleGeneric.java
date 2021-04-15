package com.example.generics;

class Point<T>{
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Trio<T,U,V> {
    private T first;
    private U second;
    private V third;

    @Override
    public String toString() {
        return "Trio{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }

    public Trio(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}

public class SimpleGeneric {
    public static void main(String[] args) {
        Point<Integer> point = new Point<>(10,20);
        System.out.println(point.toString());
        Point<String> pointStr = new Point<>("X", "Y");
        System.out.println(pointStr.toString());

        Trio<String,Integer,Double> trio = new Trio<>("Wow", 12, 15.23423234d);
        System.out.println(trio.toString());

    }
}
