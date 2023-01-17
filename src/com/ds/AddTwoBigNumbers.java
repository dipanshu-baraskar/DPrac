package com.ds;

public class AddTwoBigNumbers {
    public static void main(String[] args) {
        String a = "981";
        String b = "19";

        String aa = "0";
        String bb = "0";

        add(a, b);
    }

    private static char getCharacter(String s, int pos) {
        if (pos < s.length() && pos >= 0) {
            return s.charAt(pos);
        } else {
            return '0';
        }
    }

    private static StringBuilder add(String a, String b) {
        StringBuilder op = new StringBuilder();
        char x;
        char y;
        int rem;
        int carry = 0;
        int lenA = a.length();
        int lenB = b.length();

        int len = Math.max(lenA, lenB);

        for (int i = 0; i <= len; i++) {
            x = getCharacter(a, lenA - 1);
            y = getCharacter(b, lenB - 1);
            lenB--;
            lenA--;

//            int result = Integer.parseInt(String.valueOf(x)) + Integer.parseInt(String.valueOf(y)) + carry;
            int result = (x - '0') + (y - '0') + carry;
            if (result <= 9) {
                carry = 0;
                op.insert(0, result);
            } else {
                rem = result % 10;
                carry = result / 10;
                op.insert(0, rem);
            }
        }
        op = new StringBuilder(op.charAt(0) == '0' ? op.substring(1) : op.toString());
        System.out.println("****op****: " + op);
        return op;
    }
}
