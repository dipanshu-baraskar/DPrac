package com.thread;

import dip.cmp.Employee;

public class Runner {
    public static void main(String[] args) {
        new Thread(new Thread1(new Employee(1,"Dip"))).start();
        new Thread(new Thread2(new Employee(1,"Dip"))).start();
        new Thread(new Thread3(new Employee(1,"Dip"))).start();
        new Thread(new Thread4(new Employee(1,"Dip"))).start();
    }
}
