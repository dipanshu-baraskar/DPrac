package com.ds.str;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {

    public static void main(String[] args) {
        System.out.println(isAnagram1("abc", "cba"));
        System.out.println(isAnagram2("abc", "cba"));
    }

    private static boolean isAnagram1(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0) - 1);
            } else {
                return false;
            }
        }

        for (Map.Entry<Character, Integer> ee : map.entrySet()) {
            if (ee.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagram2(String a, String b) {

        if(a.length()!=b.length()){
            return false;
        }
        char[] aCh = a.toCharArray();
        char[] bCh = b.toCharArray();

        Arrays.sort(aCh);
        Arrays.sort(bCh);

        for (int i = 0; i < a.length(); i++) {
            if (aCh[i] != bCh[i]) {
                return false;
            }
        }
        return true;
    }
}
