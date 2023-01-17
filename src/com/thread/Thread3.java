package com.thread;

import dip.cmp.Employee;

public class Thread3 implements Runnable{
    Employee e;
    public Thread3(Employee e) {
        this.e = e;
    }
    @Override
    public void run() {
        e.notify();
        for(int i=0;i<10000;i++){
            System.out.print("in T3 ");
        }

    }
}
