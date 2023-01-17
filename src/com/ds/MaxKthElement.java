package com.ds;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxKthElement {

    public static void main(String[] args) {
        int[] a = {5, 6, 4, 2, 3, 7, 3, 8, 90, 12, 14, 15, 12, 1};
        System.out.println(maxKth(a, 1));
        System.out.println(minKth(a, 1));

    }

    public static int maxKth(int[] a, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            q.add(a[i]);
        }

        for (int i = k; i < a.length; i++) {
            if (a[i] > q.peek()) {
                q.poll();
                q.add(a[i]);
            }
        }
        return q.peek();
    }

    public static int minKth(int[] a, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            q.add(a[i]);
        }

        for (int i = k; i < a.length; i++) {
            if (a[i] < k) {
                q.poll();
                q.add(a[i]);
            }
        }
        return q.peek();
    }
}
