package com.ds;

public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int[] ip = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        System.out.println(getMissingNo(ip));
    }

    private static int findNum1(int[] a) {
        int n = a.length + 1;
        int sum = n * (n + 1) / 2;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp = temp + a[i];
        }
        return sum - temp;
    }

    static int getMissingNo(int a[]) {
        int n = a.length;
        int x1 = a[0];
        int x2 = 1;
        // For xor of all the elements in array
        for (int i = 1; i < n; i++) {
            x1 = x1 ^ a[i];
        }
        // For xor of all the elements from 1 to n+1
        for (int i = 2; i <= n + 1; i++) {
            x2 = x2 ^ i;
        }
        return (x1 ^ x2);
    }
}
