package com.ds;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] ip = {1, 2, 3, 4, 5};
        int[] op = rotation(ip);
       // rotation(op);
    }

    public static int[] rotation(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        for (int r : a) {
            System.out.print(" " + r);
        }
        return a;
    }
}
