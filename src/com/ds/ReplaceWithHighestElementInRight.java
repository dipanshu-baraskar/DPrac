package com.ds;

public class ReplaceWithHighestElementInRight {
    // Write a program to replace an array element with highest element of its right and last element with -1
    // Ex : Input : [23, 21, 6, 8, 10, 1 ] = Output: [21, 10, 10, 10, 1, -1]
    public static void main(String[] args) {
        int[] a = {23, 21, 6, 8, 10, 1};
        replace(a);
    }

    private static void replace(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = Integer.MIN_VALUE;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > temp) {
                    temp = a[j];
                }
            }
            a[i] = temp;
        }
        a[a.length - 1] = -1;
        for (int z : a) {
            System.out.print(z + " ");
        }
    }

    static void nextGreatest(int arr[]) {
        int size = arr.length;
        // Initialize the next greatest element
        int max_from_right = arr[size - 1];
        // The next greatest element for the rightmost
        // element is always -1
        arr[size - 1] = -1;
        // Replace all other elements with the next greatest
        for (int i = size - 2; i >= 0; i--) {
            // Store the current element (needed later for
            // updating the next greatest element)
            int temp = arr[i];
            // Replace current element with the next greatest
            arr[i] = max_from_right;
            // Update the greatest element, if needed
            if (max_from_right < temp) max_from_right = temp;
        }
    }

}
