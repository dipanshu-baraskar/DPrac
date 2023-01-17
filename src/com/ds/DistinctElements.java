package com.ds;

import java.util.HashMap;
import java.util.Map;

public class DistinctElements {
    public static void main(String[] args) {
        int[] ip = {5,5,5};
        System.out.println(distinctElement(ip));
    }

    public static int distinctElement(int[] a) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(a[i])) {
                m.put(a[i], m.get(a[i]) + 1);
            } else {
                m.put(a[i], 1);
            }
        }
        return m.size();
    }
}
