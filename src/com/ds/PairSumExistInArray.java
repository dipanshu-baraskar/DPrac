package com.ds;

import java.util.ArrayList;
import java.util.List;

public class PairSumExistInArray {

    public static void main(String[] args) {
        int[] ip = {1, 2, 3, 5, 10, 6, 15, 9};
        printPair(ip);
    }

    private static void printPair(int[] a) {
//        List list = new ArrayList();
//        for (int z : a) {
//            list.add(z);
//        }

//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (list.contains(a[i] + a[j])) {
//                    int sum = a[i] + a[j];
//                    System.out.print(a[i] + " " + a[j] + " sum=" + sum);
//                    System.out.println();
//                }
//            }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (a[i] + a[j] == a[k]) {
                        System.out.print(a[i] + " " + a[j] + " sum=" + a[k]);
                        System.out.println();
                    }
                }
            }
        }
    }
}
