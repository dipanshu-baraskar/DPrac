package dip.cmp;

import com.practice.Emp;

import java.util.*;

public class SP {
    public static Set<Employee> remDuplicates(ArrayList<Employee> list) {
        return new HashSet<>(list);
    }


    public static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue() - o2.getValue());
        LinkedHashMap<String, Integer> op = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e : list) {
            op.put(e.getKey(), e.getValue());
        }
        return op;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Dipanshu");
        Employee e2 = new Employee(2, "Dipanshu");
        Employee e3 = new Employee(3, "Dipanshu");
        Employee e4 = new Employee(4, "Dipanshu");
        Employee e5 = new Employee(5, "Dipanshu");
        Employee e6 = new Employee(6, "Ajit");
        Employee e7 = new Employee(7, "Hari");

        ArrayList<Employee> ipAl = new ArrayList<>();
        ipAl.add(e1);
        ipAl.add(e2);
        ipAl.add(e3);
        ipAl.add(e4);
        ipAl.add(e5);
        ipAl.add(e6);
        ipAl.add(e7);
        System.out.println(remDuplicates(ipAl));

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Java", 9);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        System.out.println(sortMapByValue(hm));
    }
}
