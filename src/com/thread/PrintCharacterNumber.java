package com.thread;

public class PrintCharacterNumber {
    public static PrintCharacterNumber output = new PrintCharacterNumber();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (char i = 'a'; i <= 'z'; i++) {
                PrintCharacterNumber.output.print(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                PrintCharacterNumber.output.print(i);
            }
        });
        t1.start();
        t2.start();
    }

    private Object syncher = new Object();
    // we use an explicit synch Object, you could use annotation on methods, too. like ABHISHEK did.
    // explicit allows to deal with more complex situations, especially you could have more the one locking Object
    private int state = 0; // 0 allows chars, 1 allows ints

    public void print(char pChar) {
        synchronized (syncher) {      // prevent the other print to access state
            while (true) {
                if (state == 0) {     // char are allowed
                    System.out.print(pChar + ","); // print it
                    state = 1;        // now allow ints
                    syncher.notify(); // wake up all waiting threads
                    return;
                } else {              // not allowed for now
                    try {
                        syncher.wait();  // wait on wake up
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public void print(int pInt) {
        synchronized (syncher) {
            while (true) {
                if (state == 1) {
                    System.out.print(pInt + ",");
                    state = 0;
                    syncher.notify();
                    return;
                } else {
                    try {
                        syncher.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
