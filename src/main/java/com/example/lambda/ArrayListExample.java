package com.example.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("wow");
        arr.add("wafelki");
        //arr.add(null);
        arr.add("wowowowo");
        //arr.add(null);
        arr.add("Anna");
        arr.add("KOT");
        System.out.println(arr);
        arr.removeIf(a -> a==null || a.equalsIgnoreCase("kot"));
        System.out.println(arr);
    }
}
