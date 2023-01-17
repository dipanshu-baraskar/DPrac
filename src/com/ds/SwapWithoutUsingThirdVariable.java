package com.ds;

public class SwapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println(a);
        System.out.println(b);
    }
}
