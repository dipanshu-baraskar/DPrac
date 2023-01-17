package com.ds;

public class MinMax {
    public static void main(String[] args) {
        int[] a = {-100,100, 3, 2, -1, 5, 8, 9, 6,1000,-10000};
        minMax(a);
    }

    public static void minMax(int[] a) {
        int min = a[0];
        int max = a[1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
