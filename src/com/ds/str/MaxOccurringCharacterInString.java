package com.ds.str;

public class MaxOccurringCharacterInString {
    public static void main(String[] args) {

        String ip = "Dipanshu Baraskar";
        System.out.println(getMaxRepChar(ip));

    }

    private static char getMaxRepChar(String ip) {
        int[] count = new int[256];
        char[] ipCh = ip.toCharArray();
        for (char c : ipCh) {
            count[c]++;
        }

        int max = -1;
        char result = ' ';

        for (char i : ipCh) {
            if (max < count[i]) {
                max = count[i];
                result = i;
            }
        }
        return result;
    }
}
