package z;

import java.util.HashMap;
import java.util.HashSet;

public class Memory {

    public static void main(String[] args) { // Line 1
        int i = 1; // Line 2
        Object obj = new Object(); // Line 3
        Memory mem = new Memory(); // Line 4
        mem.foo(obj); // Line 5
    } // Line 9

    private void foo(Object param) { // Line 6
        String str = param.toString(); //// Line 7
        System.out.println(str);
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(1, 2);
        m.put(1, 3);
        System.out.println(m);
        HashSet s = new HashSet();
    } // Line 8

}
