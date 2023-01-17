package com.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Merge2Arrays {

    static void mergeArrays(int a[], int b[], int n, int m) {

        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        Map<Integer, Boolean> mp = new TreeMap<>();

        // Inserting values to a map.
        for (int i = 0; i < n; i++) {
            mp.put(a[i], true);
        }
        for (int i = 0; i < m; i++) {
            mp.put(b[i], true);
        }
        HashMap mm= new HashMap();
        mm.put(1,2);
        // Printing keys of the map.
        for (Map.Entry<Integer, Boolean> me : mp.entrySet()) {
            System.out.print(me.getKey() + " ");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7}, b[] = {1, 2, 4, 6, 8};
        int size = a.length;
        int size1 = b.length;

        // Function call
        mergeArrays(a, b, size, size1);
    }
}

