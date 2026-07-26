package javaprogram.MultiThreading;

public class Demo2 {
    static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        MyRunnable r1=new MyRunnable();
        Thread t1=new Thread(r1);
        t1.start();

        Thread t2=new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            System.out.println("Thread-2 is running");
        });
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());

        try {
            t2.sleep(2000);
            System.out.println(t2.getState());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Thread is running");
    }
}
