package com.test;

public class T1 implements Runnable {
    Thread t;

    T1(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("In T1");
        A o1 = new A();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        o1.m1();
    }
}
