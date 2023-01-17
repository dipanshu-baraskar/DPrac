package com.ds;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Wall {
    //return the first unique word out of the processed stream of words
    //My name is Dipanshu My address is Jaipur
    //My My My My name name name name

    public static void main(String[] args) {
        String ip = "My name is Dipanshu My address is Jaipur name";
        uniqueWords(ip);
    }

    public static void uniqueWords(String s) {
        String[] ar = s.split(" ");
        HashSet<String> hs = new LinkedHashSet();
        StringBuilder op = new StringBuilder();
        for (int i = 0; i < ar.length; i++) {
            if (hs.contains(ar[i])) {
                hs.remove(ar[i]);
            } else {
                hs.add(ar[i]);
            }
            op.append(hs.iterator().next() + " ");
        }
        System.out.println(op);
    }
}
