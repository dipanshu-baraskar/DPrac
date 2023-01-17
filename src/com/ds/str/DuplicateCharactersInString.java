package com.ds.str;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharactersInString {

    public static void main(String[] args) {
        String ip = "Java is OOP 1100OOO";
        dupChar(ip);
    }

    public static void findDup(String s) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

    }

    public static void dupChar(String s) {
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    ch[j] = ' ';
                }
            }
            if (count > 1 && ch[i] != ' ') {
                System.out.println(ch[i] + " " + count);
            }
        }
    }

    public static void dup(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
                    System.out.println(s.charAt(i));
                    break;
                }
            }
        }
    }
}
