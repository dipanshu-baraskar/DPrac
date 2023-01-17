package com.ds.str;

public class ReverseExceptSpecialChar {

    public static void main(String[] args) {
        revSpclChar("Ab,c,de!@");
    }
    private static void revSpclChar(String s) {
        // Initialize left and right pointers
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;

        // Traverse string from both ends until 'i' and 'j'
        while (i < j) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[i])) {
                i++;
            } else if (!Character.isAlphabetic(str[j])) {
                j--;
            }
            // Both str[i] and str[j] are not spacial
            else {
                char tmp = str[i];
                str[i] = str[j];
                str[j] = tmp;
                i++;
                j--;
            }
        }
        System.out.println(String.valueOf(str));
    }
}
