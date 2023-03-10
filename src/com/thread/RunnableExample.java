package com.thread;

// Java program to illustrate Runnable
// for random number generation

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class RunnableExample implements Runnable {
    // Shared object to store result
    private Object result = null;

    public void run() {
        System.out.println(Thread.currentThread().getName());
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(5);

        // As run cannot throw any Exception
        try {
            Thread.sleep(randomNumber * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Store the return value in result when done
        result = randomNumber;

        // Wake up threads blocked on the get() method
        synchronized (this) {
            notifyAll();
        }
    }

    public synchronized Object get() throws InterruptedException {
        while (result == null) {
            wait();
        }
        return result;
    }
}




