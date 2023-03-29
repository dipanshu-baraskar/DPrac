package com.ds.str;

public class AllPermutationsOfString {

    public static void main(String[] args) {
        String s = "abc";
        int l = 0;
        int r = s.length() - 1;
        findPerm(s, l, r);
    }

    private static void findPerm(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                findPerm(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }

    private static String swap(String s, int i, int j) {
        char[] ch = s.toCharArray();
        char temp;
        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}
