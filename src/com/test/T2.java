package com.test;

public class T2 implements Runnable{
    @Override
    public void run() {
        System.out.println("in T2");
        A o2= new A();
        o2.m1();
    }
}
