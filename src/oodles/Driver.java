package oodles;

import oodles.thread.MyThread;

public class Driver {
    static void main(String[] args) {
//        StackUsingArray sa=new StackUsingArray(10);
//        sa.push(20);
//        sa.push(30);
        MyThread myThread=new MyThread();
        Thread t=new Thread(myThread);
        t.start();
    }
}
