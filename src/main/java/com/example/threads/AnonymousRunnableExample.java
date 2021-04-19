package com.example.threads;

public class AnonymousRunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i<11; i++){
                    System.out.println("WARTOŚĆ i = " + i);
                }
            }
        });
        thread.start();
    }
}
