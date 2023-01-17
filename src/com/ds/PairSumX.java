package com.ds;

import java.util.HashSet;

public class PairSumX {
    public static void main(String[] args) {
        int[] ip = {1, 4, 45, 6, 10, 8, 8};
        pair(ip, 16);
    }

    public static void pair(int[] a, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int temp = sum - a[i];
            if (hs.contains(temp)) {
                System.out.println("Pair is: " + temp + " and " + a[i]);
            }
            hs.add(a[i]);
        }
    }
}
