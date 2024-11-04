package com.example.demo.volatileExample;

public class VolatileDemo {

    volatile int val1 = 0;
    int val2 = 0;
    int val3 = 0;

    private void incrementValue(){
        for(int i = 0; i<10;i++) {
            val1++;
        }
        System.out.println(Thread.currentThread().getName() + ":" + val1);
    }


    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        Runnable runnable = volatileDemo::incrementValue;
        Thread thread = new Thread(runnable);
        thread.setName("threadFirst");
        thread.start();


        Runnable runnable1 = volatileDemo::incrementValue;
        Thread thread1 = new Thread(runnable1);
        thread1.setName("threadSecond");
        thread1.start();


    }
}
