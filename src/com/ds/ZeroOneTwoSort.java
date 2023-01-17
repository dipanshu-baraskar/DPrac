package com.ds;

public class ZeroOneTwoSort {
    public static void main(String[] args) {
        int[] ip = {2, 1, 2, 1, 0, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};

        int[] op = sort(ip);
        for (int i = 0; i < op.length; i++) {
            System.out.print(" " + op[i]);
        }
    }

    public static int[] sort(int[] a) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        int temp;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
            }
        }
        return a;
    }
}
