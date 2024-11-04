package com.example.demo.Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientInializer {

    static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        NumberPrinter printer2 = new NumberPrinter();
        executorService.execute(printer);
        executorService.execute(printer2);
        executorService.shutdown();
    }
}
