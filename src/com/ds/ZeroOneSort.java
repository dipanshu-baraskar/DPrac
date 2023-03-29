package com.ds;

public class ZeroOneSort {
    public static void main(String[] args) {
        int[] ip = {1, 1, 0, 0, 1, 1, 0, 0};
        sortZeroOne(ip);
    }

    private static void sortZeroOne(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            while (a[left] == 0) {
                left++;
            }

            while (a[right] == 1) {
                right--;
            }

            if (left < right) {
                a[left] = 0;
                a[right] = 1;
                left++;
                right--;
            }
        }

        for (int op : a) {
            System.out.print(op + " ");
        }
    }
}
