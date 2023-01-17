package com.ds;

public class MinSwapsToGetOnesTogether {
    static int minSwaps(int[] a, int n) {
        int totalCount = 0;
        int i;
        for (i = 0; i < n; i++) {
            totalCount = totalCount + a[i];
        }

        int currCount = 0;
        int maxCount = 0;

        // start of window
        i = 0;

        // end of window
        int j = 0;

        while (j < n) {
            currCount += a[j];

            // update maxCount when reach window size i.e.
            // total count of ones in array
            if ((j - i + 1) == totalCount) {
                maxCount = Math.max(maxCount, currCount);
                if (a[i] == 1)
                    currCount--; // decrease current count
                // if first element of
                // window is 1

                // slide window
                i++;
            }
            j++;
        }

        return totalCount - maxCount;
        // return total no of ones in array
        // - maximum count of ones out of
        // all windows

    }

    public static void main(String args[]) {
        int[] a = {1, 0, 1, 0, 1, 1};
        int n = a.length;

        System.out.println(minSwaps(a, n));
    }
}
