package com.example.lambda;

import java.util.Arrays;

public class ArraysSortLambda {
    public static void main(String[] args) {
        String arrStr[] = {"Ford", "BMW", "Wafelki", "Audi", "Mercedes"};
   //     Arrays.sort(arrStr); // alfabetycznie
        Arrays.sort(arrStr,(a,b) -> {return a.length() - b.length();}); // według długości znaków
        for (String s: arrStr) System.out.println(s);
    }
}
