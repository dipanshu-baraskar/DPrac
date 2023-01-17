package com.practice;

public class EvenOddThread {
    int N;
    int count = 1;

    EvenOddThread(int n) {
        N = n;
    }

    void printEven() {
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count);
                count++;
                notify();
            }
        }
    }

    void printOdd() {
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count);
                count++;
                notify();
            }
        }
    }


    public static void main(String[] args) {
        int ip = 10;
        EvenOddThread evenOddThread = new EvenOddThread(ip);

        new Thread(() -> {
            evenOddThread.printEven();
        }).start();
        new Thread(() -> {
            evenOddThread.printOdd();
        }).start();
    }
}
