package com.ds.str;

import java.util.HashMap;

public class AnagramDifference {

    public static void main(String[] args) {
//        System.out.println(anagramDiff("abc", "pqr"));
//        System.out.println(anagramDiff2("xyz", "pqr"));
        System.out.println(anagramDiff("1234876590", "1234890756"));


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

    private static int anagramDiff2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return -1;
        }
        int count = 0;
        int[] char_count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            char_count[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (char_count[s2.charAt(i) - 'a']-- <= 0) {
                count++;
            }
        }
        return count;
    }
}