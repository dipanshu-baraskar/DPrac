package com.test;

public class ThreadShort {
    public static void main(String[] args) {

        boolean flag = false;
        Thread t1 = new Thread(() -> {
            if (flag == true) {
                A o1 = new A();
                o1.m1();
                ThreadShort ts= new ThreadShort();
            }
        });
        Thread t2 = new Thread(() -> {

            A o2 = new A();
            o2.m1();
        });
        t1.start();
        t2.start();

    }
}
