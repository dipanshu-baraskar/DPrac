package com.thread;

public class EvenOddTask implements Runnable {
    private EvenOddPrinter print;
    private int max;
    private boolean isEvenNumber;

    // standard constructors
    public EvenOddTask(EvenOddPrinter print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}
