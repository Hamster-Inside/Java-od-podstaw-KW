package com.example.lambda;

@FunctionalInterface
interface MathInterface {
    int operate(int a, int b);
    default int add(int a, int b){
        return a+b;
    }
    default int subtract (int a, int b){
        return a-b;
    }
    static int multiply (int a, int b){
        return a*b;
    }
}
class MathClass implements MathInterface {
    @Override
    public int operate(int a, int b) {
        return a+b;
    }

    @Override
    public int add(int a, int b) {
        System.out.print("dodawanie: ");
        return MathInterface.super.add(a, b);
    }

}

public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        MathInterface math = (int a, int b) -> a*b;
        System.out.println(math.operate(10,30));
        System.out.println(MathInterface.multiply(20,50));
        System.out.println(math.subtract(30,10));
        MathClass mathClass = new MathClass();
        System.out.println(mathClass.operate(100,100));
        System.out.println(mathClass.add(20,20));
        System.out.println(mathClass.subtract(300,150));

    }
}
