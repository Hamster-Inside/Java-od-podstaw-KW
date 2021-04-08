package com.example.oop.basics.methods;

class Triangle {
    float a;
    float h;
    float surfaceArea;

    Triangle(float base, float height){
        a = base;
        h = height;
    }

}

class MyMath {

    public void add (int a, int b){
        a=20;
        int result = a+b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Result = " + result);
    }

}
public class InvokingMethods {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int c = 10;
        int d = 7;
        math.add(c,d);

        Triangle triangle = new Triangle(10f, 5f);
    }
}
