package com.ds.str;

import java.util.HashMap;

public class AnagramDifference {

    public static void main(String[] args) {
        System.out.println(anagramDiff("abc", "pqr"));
    }

    private static int anagramDiff(String a, String b) {
        int res = 0;
        char[] aCh = a.toCharArray();
        char[] bCh = b.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        if (a.length() != b.length()) {
            return -1;
        } else {
            for (Character c : aCh) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (Character c : bCh) {
                map.put(c, map.getOrDefault(c, 0) - 1);
                if (map.get(c) < 0) {
                    res++;
                }
            }
        }
        return res;
    }
}
