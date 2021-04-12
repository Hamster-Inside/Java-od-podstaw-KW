package com.example.oop.basics.exceptions;

class TestException extends Exception {
    public TestException() {
        super("TestException happened");
    }

    public TestException(String message) {
        super(message);
    }

}

public class ThrowException {

    public int divide(int number, int divisor) throws ArithmeticException {
        return number / divisor;
    }

    public int test(int number) throws TestException {
        if (1 == 1) throw new TestException("Test rzucony");
        return 1;
    }

    public static void main(String[] args) {
        try {
            int numArr[] = {0, 1, 2, 3, 4, 5};
            int a = numArr[2];
            int b = numArr[5];
            int divisor = numArr[0];
            if (divisor == 0) throw new ArithmeticException("Dzielenie przez 0");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        } finally {
            System.out.println("Finally made");
        }
        System.out.println("Program continues");
        ThrowException throwException = new ThrowException();
        try {
            throwException.divide(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            throwException.test(12);
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}
