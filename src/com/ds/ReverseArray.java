package com.ds;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] op = reverse(a);
        for (int e : op) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(reverse("DIP"));
    }

    public static int[] reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }

    public static String reverse(String s){
        int i=0;
        int j=s.length()-1;
        char[] c=s.toCharArray();
        while (i<j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);
    }
}
