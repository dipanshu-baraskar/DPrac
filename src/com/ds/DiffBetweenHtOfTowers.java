package com.ds;

import java.util.Arrays;

public class DiffBetweenHtOfTowers {
    public static void main(String[] args) {

//        int[] arr = {1, 5, 15, 10};//8
//        int k = 3;
//        int[] arr = { 7, 4, 8, 8, 8, 9 };//5
//        int k = 6;
        int[] arr = {1, 1, 3, 4, 5};
        int k = 2;
        int ans = getMinDiff(arr, arr.length, k);
        System.out.println(ans);
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        //1,5,10,15//3
        // Maximum possible height difference
        int ans = arr[n - 1] - arr[0];
        int tempMin, tempMax;
        tempMin = arr[0];
        tempMax = arr[n - 1];
        for (int i = 1; i < n; i++) {
            // if on subtracting k we got negative then continue
            System.out.println("before cont");
            if ((arr[i] - k) < 0) {
                System.out.println("in cont");
                continue;
            }
            System.out.println("after cont");
            // Minimum element when we add k to whole array
            tempMin = Math.min(arr[0] + k, arr[i] - k);
            System.out.print(arr[0] + k);
            System.out.print(":");
            System.out.print(arr[i] - k);
            System.out.print("|");
            // Maximum element when we subtract k from whole array
            tempMax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            System.out.print(arr[i - 1] + k);
            System.out.print(":");
            System.out.println(arr[n - 1] - k);
            System.out.print(tempMin);
            System.out.print(",");
            System.out.print(tempMax);
            System.out.println();
            System.out.print(ans);
            System.out.print(",");
            System.out.print(tempMax - tempMin);
            System.out.println();
            ans = Math.min(ans, tempMax - tempMin);
            System.out.println(ans);
        }
        return ans;
    }

    public static int getMinDiffDuplicateFunction(int[] arr, int n, int k) {
        Arrays.sort(arr);
        //1,5,10,15//3
        // Maximum possible height difference
        int ans = arr[n - 1] - arr[0];
        int tempMin, tempMax;
        tempMin = arr[0];
        tempMax = arr[n - 1];
        for (int i = 1; i < n; i++) {
            // if on subtracting k we got negative then continue
            if ((arr[i] - k) < 0) {
                continue;
            }
            // Minimum element when we add k to whole array
            tempMin = Math.min(arr[0] + k, arr[i] - k);
            // Maximum element when we subtract k from whole array
            tempMax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempMax - tempMin);
            System.out.println(ans);
        }
        return ans;
    }
}

