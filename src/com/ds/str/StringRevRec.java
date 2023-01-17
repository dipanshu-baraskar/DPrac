package com.ds.str;

public class StringRevRec {

    public static void main(String[] args) {
        System.out.println(reverseString("dip"));
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
