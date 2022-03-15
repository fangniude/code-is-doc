package jvm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author rd20
 */
public class Dog extends Animal {
    private static String abc = "abc";
    private String a;
    private int b;

    @Override
    public void soundInternal() {
        switch (a) {
            case "a":
                b = 1;
                break;
            case "b":
            default:
                b = 2;

        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        Thread.sleep(1000);

        MyThread t2 = new MyThread();
        t2.start();
        Thread.sleep(1000);

        System.out.println("t1: " + t1.getState());
        System.out.println("t2: " + t2.getState());

        t2.interrupt();
        System.out.println(t2.isInterrupted());
        System.out.println("t12: " + t1.getState());
        System.out.println("t22: " + t2.getState());
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(20));
            System.out.println("Thread run" + this.getState());
        }
    }
}
