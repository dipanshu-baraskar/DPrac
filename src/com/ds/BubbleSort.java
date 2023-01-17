package com.ds;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ip = {5, 4, 3, 8, 7};
        sort(ip);
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("iiiiii->" + a[i]);
            for (int j = i + 1; j < a.length; j++) {
                System.out.println("j->" + a[j]);
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }

        for (int z : a) {
            System.out.println(z);
        }
    }
}
