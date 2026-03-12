package com.revision;

class Counter1 {

    int count = 0;

     void increment() {
        count++;
    }
}

public class Sync2 {

    public static void main(String[] args) throws InterruptedException {

        Counter1 c = new Counter1();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<100000;i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<100000;i++){
                c.increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for(int i=0;i<100000;i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(c.count);
    }
}