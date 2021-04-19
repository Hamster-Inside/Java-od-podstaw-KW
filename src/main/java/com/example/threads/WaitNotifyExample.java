package com.example.threads;

import java.util.LinkedList;

class House {
    public LinkedList<String> delivery = new LinkedList<>();

    public void waitForDelivery() {
        synchronized (delivery) {
            System.out.println("Waiting for delivery");
            while (delivery.isEmpty()) {
                try {

                    delivery.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("Pizza Dostarczona ----> " + delivery.poll());
        }
    }

    public void pizzaGuy() {
        synchronized (delivery) {
            System.out.println("Pizza Jedzie");
            delivery.add("Special pizza");
            delivery.notify();
            System.out.println("Pizza dojechała?");
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        House house = new House();
        Thread customer = new Thread(new Runnable() {
            @Override
            public void run() {
                house.waitForDelivery();

            }
        });
        customer.start();
        Thread.sleep(5000);
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                house.pizzaGuy();
            }
        });
        producer.start();
        customer.join();
    }
}
