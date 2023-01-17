package com.ds;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        char[] arr = s.toCharArray();

        int result = 0;
        int intVal, nextIntVal;

        for (int i = 0; i < arr.length; i++) {
            intVal = map.get(arr[i]);

            if (i != arr.length - 1) {
                nextIntVal = map.get(arr[i + 1]);
                if (nextIntVal > intVal) {
                    intVal = nextIntVal - intVal;
                    i++;
                }
            }
            result = result + intVal;
        }
        return result;
    }

    private static int romanToInt3(String s) {

        Map<Character, Integer> roman = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            // If present value is less than next value,
            // subtract present from next value and add the
            // resultant to the sum variable.
            if (i != n - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                sum += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
                i++;
            } else {
                sum += roman.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void romanToInt2(String s) {
        Map<Character, Integer> translations = new HashMap<>();

        //Adding elements to map
        translations.put('I', 1);
        translations.put('V', 5);
        translations.put('X', 10);
        translations.put('L', 50);
        translations.put('C', 100);
        translations.put('D', 500);
        translations.put('M', 1000);

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number + (translations.get(s.charAt(i)));
        }
        System.out.println(number);
    }
}

