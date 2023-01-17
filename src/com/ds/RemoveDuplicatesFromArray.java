package com.ds;

public class RemoveDuplicatesFromArray {
    private static int removeDuplicates(int[] a, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[n - 1];
        j++;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5};
        int n = arr.length;
        n = removeDuplicates(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
