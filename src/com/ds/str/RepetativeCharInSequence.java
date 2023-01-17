package com.ds.str;

public class RepetativeCharInSequence {


    public static void main(String[] args) {
        String input = "AAABBBBCCAaabb";
        comp(input);
    }

    public static void comp(String input) {
        int count = 1;
        char last = input.charAt(0);
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            if (input.charAt(i) == last) {
                count++;
            } else {
                if (count > 1) {
                    output.append("" + last + count);
                } else {
                    output.append(last);
                }
                count = 1;
                last = input.charAt(i);
            }
        }
        if (count > 1) {
            output.append("" + last + count);
        } else {
            output.append(last);
        }
        System.out.println(output);
    }

}
