package dip.cmp;

import java.util.HashSet;

public class Rect {

    //[0, 0| 100, 0|100, 50| 0, 50]
    //0,100,50,50
    //[20, 20| 90, 20| 90, 50| 20, 50]

    public static int areaOfRect(int[] a) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        int length = 0;
        int breadth = 0;
        for (int i = 0; i < a.length - 1; i = i + 2) {
            hs1.add(a[i]);
            hs2.add(a[i + 1]);
        }
        System.out.println(hs1);
        System.out.println(hs2);

        Integer[] a1 = hs1.toArray(new Integer[hs1.size()]);
        Integer[] a2 = hs2.toArray(new Integer[hs2.size()]);

        if ((a1[0] < 0 && a1[1] < 0) || (a1[0] > 0 && a1[1] > 0)) {
            length = Math.abs(a1[0]) - Math.abs(a1[1]);
        } else {
            length = Math.abs(a1[0]) + Math.abs(a1[1]);
        }

        if ((a2[0] < 0 && a2[1] < 0) || (a2[0] > 0 && a2[1] > 0)) {
            breadth = Math.abs(a2[0]) - Math.abs(a2[1]);
        } else {
            breadth = Math.abs(a2[0]) + Math.abs(a2[1]);
        }

        return Math.abs(length) * Math.abs(breadth);
    }

    public static void main(String[] args) {
        int[] ip1 = {0, 0, 100, 0, 100, 50, 0, 50};
        int[] ip2 = {-4, -3, -4, 1, 3, 1, 3, -3};
        int[] ip3 = {20, 20, 90, 20, 90, 50, 20, 50};
        int[] ip4 = {-1, 1, -1, 6, -4, 1, -4, -6};
        int[] ip5 = {1, -1, 6, -1, 6, -4, 1, -4};
        int[] ip6 = {-4, -1, -4, -2, -1, -1, -1, -2};
        int[] ip7 = {0, 0, 4, 0, 4, -2, 0, -2};

        System.out.println(areaOfRect(ip3));
    }
}
