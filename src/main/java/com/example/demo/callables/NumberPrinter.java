package com.example.demo.callables;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberPrinter implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        Thread.sleep(10000);
        return random.nextInt();
    }

}
