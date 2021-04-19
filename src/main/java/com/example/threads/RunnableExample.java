package com.example.threads;

class RunnableClass implements Runnable{
    private int sleepTime;
    private String name;
    public RunnableClass(String name, int sleepTime) {
        this.sleepTime = sleepTime;
        this.name = name;
    }


    @Override
    public void run() {

        for (int i = 1; i <11; i++){
            System.out.println("Thread: " + this.name+ "       Licznik: " + i);
            try {
                Thread.sleep(this.sleepTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class RunnableClass2 extends RunnableClass implements Runnable{
    private Thread thread;

    public RunnableClass2(String name, int sleepTime) {
        super(name, sleepTime);
    }

    public void start(){
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        RunnableClass t1 = new RunnableClass("thread1", 200);
        Thread thread1 = new Thread(t1, "thread1");
        thread1.start();
        RunnableClass t2 = new RunnableClass("thread2", 500);
        Thread thread2 = new Thread(t2, "thread2");
        thread2.start();
        RunnableClass2 t3 = new RunnableClass2("thread3", 100);
        t3.start();
    }
}
