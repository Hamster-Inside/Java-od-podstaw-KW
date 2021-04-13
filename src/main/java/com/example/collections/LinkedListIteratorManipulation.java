package com.example.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorManipulation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addLast("Wafelek");
        list.addFirst("Rafał");
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Before: " + list);
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("Ola")) {
                iterator.set("Zuza");
            }
            if (str.equalsIgnoreCase("Adam")) {
                iterator.add("Koguttttttttt");
            }
            if (str.equalsIgnoreCase("Rafał")) {
                iterator.remove();
            }
        }
        // System.out.println(str);
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }
    }
}
