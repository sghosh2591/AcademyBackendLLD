package com.example.demo.callables;

import java.util.concurrent.*;

public class Client {

   private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws ExecutionException, InterruptedException{
     NumberPrinter numberPrinter = new NumberPrinter();
     Future<Integer> future = executorService.submit(numberPrinter);
     int result = 0;
//   result = future.get();
        try{
            result = future.get(6000, TimeUnit.MILLISECONDS);
            System.out.println("Was waiting for result "+result);
        }catch (TimeoutException e){
            System.out.println("Was not able to fetch result Timeout");
        }finally {
            executorService.shutdown();
        }
     System.out.println("This is main thread "+Thread.currentThread().getName());
    }
}
