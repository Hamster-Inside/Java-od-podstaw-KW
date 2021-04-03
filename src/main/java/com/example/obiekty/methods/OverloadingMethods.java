package com.example.obiekty.methods;

class MathOverloading{
    public int add (int a, int b, int c){
        return a+b+c;
    }
    public int add (int a, int b){
        return a+b;
    }

}


public class OverloadingMethods {
    public static void main(String[] args) {
 MathOverloading math = new MathOverloading();
 int a = 12;
 int b = 3;
 int c = 5;
        System.out.println(math.add(a,b,c));
    }
}
