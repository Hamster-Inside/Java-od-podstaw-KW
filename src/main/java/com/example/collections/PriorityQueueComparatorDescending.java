package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

// kolejność malejąca
class DescendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        if (x == y) return 0;
        if (x < y) return 1; // dla malejącej
        else return -1;
    }
}

public class PriorityQueueComparatorDescending {
    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<>(new DescendingComparator());
        test.add(99);
        test.add(12);
        test.add(50);
        test.add(50);
        test.add(88);
        test.add(103);
        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }

    }
}
