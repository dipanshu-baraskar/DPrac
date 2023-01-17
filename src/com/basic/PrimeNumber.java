package com.basic;

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 500000000;

        if (n <= 1) {
            System.out.println("not prime");
        }

        if (n == 2) {
            System.out.println("prime");
        }

        if (n % 2 == 0) {
            System.out.println("not prime");
        }
        System.out.println(Math.sqrt(n));
        System.out.println(n / 2);
        for (int i = 3; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("not prime");

    }
}
