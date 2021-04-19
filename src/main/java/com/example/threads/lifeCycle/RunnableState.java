package com.example.threads.lifeCycle;

public class RunnableState {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 11; i++) {
                    try {
                        Thread.sleep(200);
                        System.out.println("i: " + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        thread.start();
        System.out.println(thread.getState());
    }
}
