package javaprogram.MultiThreading;

public class ThreadA implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Execution Starting...........");
        for(int i=1;i<50;i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread Execution ending...........");
    }
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        Thread t1=new Thread(a);
        t1.start();
    }
}
