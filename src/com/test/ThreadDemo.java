package com.test;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t2 = new Thread(new T2());

        Thread t1 = new Thread(new T1(t2));
        t1.start();
        t2.start();


    }
}
