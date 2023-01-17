package com.ds;

public class Reverse {

    public static void main(String[] args) {
        String s = "I am a Java developer";
        System.out.println(Reverse.strRev(s));
    }

    public static String strRev(String s) {

        char[] c = s.toCharArray();

        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            if (c[i] == ' ') {
                i++;
            } else if (c[j] == ' ') {
                j--;
            } else {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        return new String(c);
    }
}

