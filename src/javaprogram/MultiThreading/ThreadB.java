package javaprogram.MultiThreading;

public class ThreadB extends Thread {

    public void run() {
        System.out.println("Thread Execution Starting...........");
        for (int i = 1; i < 10; i++) {
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
        tb.start();   // starts a new thread
    }
}
