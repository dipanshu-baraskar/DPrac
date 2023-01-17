package com.ds;

public class PairSumExistsInSortedArray {

    public static void main(String[] args) {
        int ip[] = {1, 2, 3, 4, 5};
        int sum = 3;
        pairSum(ip, sum);
    }

    private static void pairSum(int a[], int sum) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] + a[j] == sum) {
                System.out.println(a[i] + " " + a[j]);
                return;
            } else if (a[i] + a[j] < sum) {
                i++;
            } else if (a[i] + a[j] > sum) {
                j--;
            }
        }
        System.out.println("NA");
    }
}
