package com.example.oop.basics.exceptions;

public class ExceptionsBasics {
    public static void main(String[] args) {
        try {
                int numArr[] = {0,1,2,3,4,5};
                int a = numArr[2];
                int b = numArr[22];
                int result = a / numArr[0];
        }
        catch(Exception e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally made");
        }
        System.out.println("Program continues");
    }
}
