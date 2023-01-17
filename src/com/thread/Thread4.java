package com.thread;

import dip.cmp.Employee;

public class Thread4 implements Runnable{
    Employee e;
    public Thread4(Employee e) {
        this.e = e;
    }
    @Override
    public void run() {
        try {
            e.wait();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        for(int i=0;i<10000;i++){
            System.out.print("in T4 ");
        }
    }
}
