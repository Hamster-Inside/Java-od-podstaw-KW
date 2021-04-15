package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        return x.length() - y.length();
    }
}

public class PriorityQueueStringLengthComparator {
    public static void main(String[] args) {
        PriorityQueue<String> test =
                new PriorityQueue<>(new StringLengthComparator());
        test.add("Daniel");
        test.add("Ola");
        test.add("Wafelek");
        test.add("Zbyszekowski");
        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }
}
