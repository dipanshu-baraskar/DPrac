package com.ds;

import java.util.HashMap;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] ip = {10, 5, -5, 15, -10, 5};
        subArray(ip, 25);
    }

    public static void subArray(int[] a, int sum) {
        int start = 0;
        int end = -1;
        int currSum = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            currSum = currSum + a[i];
            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (m.containsKey(currSum - sum)) {
                start = m.get(currSum - sum) + 1;
                end = i;
                break;
            }
            m.put(currSum, i);
        }
        if (end == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Start: " + start + " End: " + end);
        }
    }
}
