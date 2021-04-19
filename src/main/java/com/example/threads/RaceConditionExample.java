package com.example.threads;

public class RaceConditionExample {
    public int counter = 0;
    public void increment(){
        this.counter++;
    }
    public static void main(String[] args) throws InterruptedException{
     RaceConditionExample race = new RaceConditionExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<200000; i++){
                   race.increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<200000; i++){
                    race.increment();
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<200000; i++){
                    race.increment();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(race.counter);

    }
}
