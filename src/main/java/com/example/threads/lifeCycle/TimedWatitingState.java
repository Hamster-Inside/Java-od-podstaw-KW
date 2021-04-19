package com.example.threads.lifeCycle;

public class TimedWatitingState {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        Thread.sleep(200);
        System.out.println(thread.getState());
    }
}
