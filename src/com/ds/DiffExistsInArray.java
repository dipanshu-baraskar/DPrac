package com.ds;

import java.util.Arrays;
import java.util.HashSet;

public class DiffExistsInArray {

    public static void main(String[] args) {
        int[] ip = {1, 2, 3, 4, 5,7};
        diffExists(ip, 2);
    }

    private static void diffExists(int[] a, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int diff = k - a[i];
            if (hs.contains(Math.abs(diff))) {
                System.out.println(Math.abs(diff) + " " + a[i]);
            }
            hs.add(a[i]);
        }
    }

}
