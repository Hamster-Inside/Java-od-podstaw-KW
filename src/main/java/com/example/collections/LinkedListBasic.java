package com.example.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addLast("Wafelek");
        list.addFirst("Rafał");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.contains(p1));
        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");
        System.out.println(list);
        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Ania");
        System.out.println(list);
        list.add(2, "Zenon");
        System.out.println(list);
        list.set(1, "Krowa");
        System.out.println(list.size());
        System.out.println(list);
        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()){
            String str = iterator1.next();
            System.out.println(str);
        }
        while (iterator1.hasPrevious()){
            String str = iterator1.previous();
            System.out.println(str);
        }
    }
}
