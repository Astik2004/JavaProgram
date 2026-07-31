package javaprogram.MultiThreading;

public class ThreadCommunication {
    static void main(String[] args) throws InterruptedException {
        Shared s=new Shared();
        Thread produce=new Thread(()->
                s.producer()
        );
        Thread consumer=new Thread(()->{
            try {
                s.consumer();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        consumer.start();

        Thread.sleep(2000);

        produce.start();
    }
}

class Shared{
    private boolean available=false;

    public synchronized void producer()
    {
        System.out.println("Produced");
        available=true;
        notify();
    }
    public synchronized void consumer() throws Exception
    {
        while(!available)
        {
            wait();
        }
        System.out.println("Consumed");
        available=false;
    }
}
