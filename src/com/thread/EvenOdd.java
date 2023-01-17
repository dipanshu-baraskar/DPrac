package com.thread;

// Java program for the above approach

public class EvenOdd {

    // Starting counter
    private int counter = 1;

    static int N;


    // Function to print odd numbers
    public void printOddNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {
                // If count is even then print
                while (counter % 2 == 0) {
                    // Exception handle
                    try {
                        System.out.println("odd wait");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.println(counter + " " + Thread.currentThread().getName());
                // Increment counter
                counter++;
                // Notify to second thread
                System.out.println("odd notify");
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {
                // If count is odd then print
                while (counter % 2 == 1) {
                    // Exception handle
                    try {
                        System.out.println("even wait");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.println(counter + " " + Thread.currentThread().getName());
                // Increment counter
                counter++;
                // Notify to 2nd thread
                System.out.println("even notify");
                notify();
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        // Given Number N
        EvenOdd.N = 10;
        // Create an object of class
        EvenOdd mt = new EvenOdd();

        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        }, "EvenThread");

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        }, "OddThread");

        // Start both threads
        t1.start();
        t2.start();
    }

}

