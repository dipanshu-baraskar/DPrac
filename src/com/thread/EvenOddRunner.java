package com.thread;

public class EvenOddRunner {
    public static void main(String[] args) {
        EvenOddPrinter print = new EvenOddPrinter();
        Thread t1 = new Thread(new EvenOddTask(print, 10, false), "Odd");
        Thread t2 = new Thread(new EvenOddTask(print, 10, true), "Even");
        t1.start();
        t2.start();
    }
}
