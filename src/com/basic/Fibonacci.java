package com.basic;

public class Fibonacci {
    public static void main(String[] args) {
        //printFibonacci(10);
        for(int i=0;i<10;i++){
            System.out.println(printFibonacciRec(i));
        }
    }

    private static void printFibonacci(int n) {
        int n1 = 0;
        int n2 = 1;

        while (n > 0) {
            System.out.print(n1 + " ");
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            n--;
        }
    }

    private static int printFibonacciRec(int n) {

        if (n <= 1) {
            return n;
        }
        return printFibonacciRec(n - 1) + printFibonacciRec(n - 2);
    }
}
