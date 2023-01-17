package z;

import java.util.HashMap;
import java.util.Map;

public class RevAr {

    public static void main(String[] args) {
        int[] ip = {1, 2, 3, 4, 5};
        // rev(ip);

//        String sIp = "Dipanshu";
//        count(sIp);



//        Customer customer = new CustomerBuilder()
//                .firstName("Dipansu")
//                .lastName("Barasker")
//                .primaryEmail("xyz@abc.com")
//                .primaryMobileNumber("1234567890")
//                .build();
    }



    public static void count(String s) {
        HashMap<Character, Integer> m = new HashMap();

        int highest = 0;
        char opChar = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (m.containsKey(s.charAt(i))) {
                    m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
                } else {
                    m.put(s.charAt(i), 1);
                }
            }
        }
        for (Map.Entry e : m.entrySet()) {
            if ((Integer) e.getValue() > highest) {
                highest = (Integer) e.getValue();
                opChar = (Character) e.getKey();
            }
        }
        System.out.println(opChar);
    }


    public static void rev(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (int z : a) {
            System.out.print(z + " ");
        }
    }

}
