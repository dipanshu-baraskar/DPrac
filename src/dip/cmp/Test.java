package dip.cmp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Test {

    //ip:73 74 75 71 69 72 76 73

    // 1,1,4,2,1,1,-1,-1

    static ArrayList<Integer> tempComp(int a[]) {

        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
                s.pop();
                list.add(1);
            } else {
                s.push(a[i]);
                count++;
                list.add(count);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] ip = {1, 1, 2, 2, 3, 3};
        ;
        int[] op = removeDup(ip);
        for (int i = 0; i < op.length; i++) {
            System.out.println(op[i]);
        }
        ArrayList l = (ArrayList) Arrays.asList(2, 1, 3, 6, 5, 4, 6, 7, 8);
        System.out.println(even(l));

    }

    //ip:1,1,1,2,2,3,3

    static int[] removeDup(int[] a) {
        int j = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[j]) {
                j++;
            } else {
                a[i] = a[j];
            }
        }
        return a;
    }

    public static List<Integer> even(ArrayList<Integer> list) {

        return list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }


}
