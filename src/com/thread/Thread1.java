package com.thread;

import dip.cmp.Employee;

public class Thread1 implements Runnable{
    Employee e;

    public Thread1(Employee e) {
        this.e = e;
    }

    @Override
    public void run() {
       e.notify();
        for(int i=0;i<10;i++){
            System.out.print("in T1 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
