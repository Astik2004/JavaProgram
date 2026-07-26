package javaprogram.MultiThreading;

public class MethodOfThread {
    static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Starting");
        Thread t1=new Thread(()->{
            System.out.println(Thread.currentThread().getState());
            for(int i=0;i<=10;i++)
           {
               System.out.println("T1 : "+i);
           }
        });
        System.out.println(t1.getState());
        t1.start();
        t1.join();

        System.out.println(t1.getState());
        System.out.println("Main Thread completed");

    }
}

class MYRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++)
        {
            System.out.println("T1 : "+i);
        }
    }
}
