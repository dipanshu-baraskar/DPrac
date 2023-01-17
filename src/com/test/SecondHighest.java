package com.test;

import java.util.PriorityQueue;

public class SecondHighest {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(secHig(a));
    }

    private static int secHig(int[] a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < 2; i++) {
            pq.add(a[i]);
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > pq.peek()) {
                pq.poll();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }
}
