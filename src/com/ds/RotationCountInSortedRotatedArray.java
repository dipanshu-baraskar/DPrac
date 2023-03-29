package com.ds;

public class RotationCountInSortedRotatedArray {
    public static void main(String[] args) {
//        Input: arr[] = {15, 18, 2, 3, 6, 12}
//        Output: 2
//        Input: arr[] = {7, 9, 11, 12, 5}
//        Output: 4
//        Input: arr[] = {7, 9, 11, 12, 15};
//        Output: 0
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(rotationCount(arr));
    }

    private static int rotationCount(int[] a) {
        if (a[0] > a[a.length - 1]) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > a[i + 1]) {
                    return i + 1;
                }
            }
        }
        return 0;
    }
}
