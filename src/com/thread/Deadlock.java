package com.thread;

public class Deadlock {
    public void produce() throws InterruptedException {
        synchronized (this) {
            while (true) {
                System.out.println("produce");
                wait();
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (true) {
                System.out.println("consume");
                wait();
            }
        }
    }

    public static void main(String[] args) {
        Deadlock d = new Deadlock();
        new Thread(() -> {
            try {
                d.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                d.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

    }
}
