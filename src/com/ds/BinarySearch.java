package com.ds;

public class BinarySearch {
    public static void main(String[] args) {

        int[] ip = {1, 2, 3, 4, 5};
        int op = binarySearch(ip, 1);
        System.out.println(op + 1);

        int[] ip2 = {-10, -1, 10, 20, 30, 100};
        System.out.println(binarySearchRecursive(ip2, 30, 0, ip2.length - 1));
    }

    public static int binarySearch(int[] a, int n) {
        //1.find mid index : mid=(low+high)/2
        //2. if a[mid] ==key , return mid
        //3. if key<a[mid]
        //4. if key>a[mid]
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == n) {
                return mid;
            } else if (n > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] a, int n, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (n == a[mid]) {
            return mid;
        }
        if (n > a[mid]) {
            return binarySearchRecursive(a, n, mid + 1, high);
        } else {
            return binarySearchRecursive(a, n, low, mid - 1);
        }
    }
}
