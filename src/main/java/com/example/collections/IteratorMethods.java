package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Wow");
        arr.add("Małpka");
        arr.add("Kogut");

        arr.iterator().forEachRemaining(el -> System.out.println("el = " + el));
        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if (str.equalsIgnoreCase("małpka")){
                iterator.remove();
            }
        }
        System.out.println(arr);
    }
}
