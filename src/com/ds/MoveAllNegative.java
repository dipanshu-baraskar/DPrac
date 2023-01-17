package com.ds;

public class MoveAllNegative {
    public static void main(String[] args) {
        int[] ip = {-12,11,-13,-5,6,-7,5,-3,11};
        int[] op = move2(ip);
        for (int e : ip) {
            System.out.print(" " + e);
        }
    }

    public static int[] move1(int[] a) {
        int i = 0;
        int j = 0;

        while (i < a.length) {
            if (a[i] < 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
            } else if (a[i] > 0) {
                i++;
            }
        }

        return a;
    }

    public static int[] move2(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            if (a[i] < 0) {
                i++;
            } else if (a[i] > 0 && a[j] < 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            } else {
                j--;
            }
        }
        return a;
    }
}
