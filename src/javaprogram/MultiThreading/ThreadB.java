package javaprogram.MultiThreading;

public class ThreadB extends Thread {

    public void run() {
        System.out.println("Thread Name : "+Thread.currentThread().getName());
        System.out.println("Thread Execution Starting...........");
        for (int i = 1; i <=5; i++) {
            try {
                System.out.println("Astik Yadav");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread Execution ending...........");
    }

    public static void main(String[] args) {
        ThreadB tb = new ThreadB();
        tb.setName("tb");
        tb.start();
        ThreadB tb1=new ThreadB();
        tb.setName("tb1");
        tb1.start();
    }
}
