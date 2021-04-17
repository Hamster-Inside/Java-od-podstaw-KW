package com.example.lambda;

interface Addition<T> {
    T add(T a, T b);
}

interface AdditionInt {
    int add(int a, int b);
}

interface MathOperation<E> {
    E operate(E a, E b);
}

public class LambdaBasics {
    public void test(AdditionInt additionint) {
        System.out.println(additionint.add(100, 50));
    }

    public static void main(String[] args) {
        Addition<Double> addition = (Double a, Double b) -> a + b;
        System.out.println(addition.add(12.5d, 7d));
        LambdaBasics lambdaBasics = new LambdaBasics();
        lambdaBasics.test((a, b) -> a * 2 + b);
        MathOperation<Integer> addition2 = (a, b) -> a + b;
        System.out.println(addition2.operate(10, 5));
        MathOperation<Integer> substraction = (a,b) -> a-b;
        System.out.println(substraction.operate(10,5));
    }
}
