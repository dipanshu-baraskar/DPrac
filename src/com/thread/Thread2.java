package com.thread;

import dip.cmp.Employee;

public class Thread2 implements Runnable{
    Employee e;
    public Thread2(Employee e) {
        this.e = e;
    }
    @Override
    public void run() {
        e.notify();
        for(int i=0;i<1000;i++){
            System.out.print("in T2 ");
        }

    }
}
