package com.example.oop.basics.methods;

class Potato{
    Potato(){
        this(4);
    }
    Potato(int a){

    }
}

class Circle {
    float radius;

    Circle (float r){
        radius = r;
    }
}
class MathMethods {
    public int add (int a, int b){
        return +a+b;
    }
    public int substract (int a, int b){
        return a-b;
    }
    public Circle getNewCircle (float radius){
        Circle c = new Circle(radius);
        return c;
    }
}
public class ReturnValueAndObjects {
    public static void main(String[] args) {
        MathMethods math = new MathMethods();
        System.out.println(math.add(5,7));
        System.out.println(math.substract(5,7));
        Circle circle = new Circle(100);
        System.out.println("radius : " + circle.radius);
        circle = math.getNewCircle(5);
        System.out.println("radius : " + circle.radius);
    }
}
