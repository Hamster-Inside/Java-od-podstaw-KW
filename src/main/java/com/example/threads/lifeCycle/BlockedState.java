package com.example.threads.lifeCycle;

class SomeThread implements Runnable {

    public static synchronized void test() {
        while (true) {
        }
    }

    @Override
    public void run() {
        test();
    }
}

public class BlockedState {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new SomeThread());
        Thread thread2 = new Thread(new SomeThread());
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        thread1.start();
        thread2.start();
        Thread.sleep(100);
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        System.out.println(thread1.getState() == Thread.State.BLOCKED);
        System.out.println(thread2.getState() == Thread.State.BLOCKED);
        System.out.println(Thread.State.BLOCKED);

    }
}
