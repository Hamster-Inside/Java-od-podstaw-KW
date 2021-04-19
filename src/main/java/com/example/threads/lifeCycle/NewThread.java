package com.example.threads.lifeCycle;

public class NewThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
                // thread.start();
                System.out.println(thread.getState());
    }
}
