package javaprogram.MultiThreading;

public class Demo {
    static void main(String[] args) {
        MyThread t1=new MyThread();
        System.out.println(Thread.currentThread().getState());
        t1.start();
    }
}


class MyThread extends Thread{
    @Override
    public void run()
    {
        System.out.println("Thread is Executing");
    }
}

/*
t1.start-->JVM asked OS to create New Thread -->Thread get stack/PC space --> Thread execute run()
 */