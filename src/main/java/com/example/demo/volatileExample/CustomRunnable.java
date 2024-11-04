package com.example.demo.volatileExample;

public class CustomRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

}
