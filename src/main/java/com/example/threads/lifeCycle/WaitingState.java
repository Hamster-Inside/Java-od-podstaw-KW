package com.example.threads.lifeCycle;

class TestThread extends Thread {
    Thread mainThread;
    public TestThread(String name, Thread mainThread) {
        super(name);
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started.");
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("i: " + i);
                Thread.sleep(500);
                System.out.println("Main thread state: " + mainThread.getState());
            }
            System.out.println(getName() + " finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class WaitingState {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread(); //główny wątek Main
        TestThread thread1 = new TestThread("Thread 1", mainThread);
        thread1.start();
        thread1.join();
        System.out.println("Main thread");
        System.out.println(mainThread.getState());
    }
}
