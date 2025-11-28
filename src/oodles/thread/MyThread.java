package oodles.thread;

public class MyThread implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=20;i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
