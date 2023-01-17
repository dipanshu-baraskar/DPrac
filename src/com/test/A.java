package com.test;

public class A {
    
    public static void display() {
        // System.out.println("in A");
    }

    public synchronized void m1() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("in A m1 " + Thread.currentThread().getName());
    }

}
