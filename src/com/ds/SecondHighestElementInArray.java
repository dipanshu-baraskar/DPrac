package com.ds;

import java.util.Collections;
import java.util.LinkedList;

public class SecondHighestElementInArray {

    public static void main(String[] args) {
        int[] a = {9, 4, 2, 1, 5, 6};
        secondHighest(a);
    }

    private static void secondHighest(int[] a) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first)
                second = a[i];
        }

        System.out.println(first + " " + second);

    }
}
