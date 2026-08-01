package javaprogram.MultiThreading.ES;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ESDemo {
    static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(2);
        for(int i=1;i<=1000000;i++)
        {
            final int task=i;
            executor.execute(()-> System.out.println("Task-"+task+" Executed by "+Thread.currentThread().getName()));

        }
        executor.shutdown();

    }
}
