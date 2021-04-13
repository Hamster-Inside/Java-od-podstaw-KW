package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        int a = 0;
        ArrayList basicList = new ArrayList();
        basicList.add(new String("test"));
        basicList.add("Info");
        String strEl = (String)basicList.get(0);
        System.out.println(strEl);
        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kasia");
        arrStr.add("Wafelek");
        arrStr.add("Kogut");
        arrStr.remove(1);
        arrStr.add("Gorylek");
        arrStr.add("Panda");
        arrStr.add("Gorylek");
        for (String s: arrStr){
            System.out.println(a + ": " +s);
            a++;

        }
        int b = 0;
        arrStr.add(0,"FASOLKA");
        arrStr.remove(3);
        Collections.sort(arrStr);
        for (String s: arrStr){
            System.out.println(b + ": " +s);
            b++;

        }
    }
}
