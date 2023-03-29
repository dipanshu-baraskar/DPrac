package com.ds.str;

public class PowerSet {
    static void printPowerSet(char[] set, int size) {
        /*size of power set of a set with size n is (2**n -1)*/
        long pow_set_size = (long) Math.pow(2, size);
        int i, j;
        /*Run from i 000..0 to 111..1*/
        for (i = 0; i < pow_set_size; i++) {
            String op="";
            for (j = 0; j < size; j++) {
                /* Check if jth bit in the i is set If set then print jth element from set */
//                number<<2
//                number>>2
                if ((i & (1 << j)) > 0) {
                    System.out.print(set[j]);
                }
            }
            System.out.println();
        }
    }

    // Driver program to test printPowerSet
    public static void main(String[] args) {
        String s = "abc";
        char[] set = s.toCharArray();
        printPowerSet(set, set.length);
    }
}

