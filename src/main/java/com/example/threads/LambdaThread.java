package com.example.threads;

public class LambdaThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i < 11; i++) {
                System.out.println("wartość i = " + i);

                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
    }
}
