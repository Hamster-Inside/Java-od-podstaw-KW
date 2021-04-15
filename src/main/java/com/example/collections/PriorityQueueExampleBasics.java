package com.example.collections;

import java.util.PriorityQueue;

public class PriorityQueueExampleBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<>();
        test.add(99);
        test.add(12);
        test.add(50);
        test.add(50);
        test.add(88);
        test.add(103);
        while (!test.isEmpty()){
            System.out.println(test.poll());
        }
        System.out.println("");
        test.add(100);
        test.add(7);
        test.add(150);
        System.out.println(test.peek());
    }
}
