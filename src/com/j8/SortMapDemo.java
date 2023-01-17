package com.j8;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "b");
        map.put(5, "a");
        map.put(2, "z");
        map.put(6, "y");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (o1, o2) -> o1.getKey() - o2.getKey());
        Collections.sort(list, Comparator.comparingInt(Map.Entry::getKey));

        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        Collections.sort(list, Map.Entry.comparingByValue());

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Employee, Integer> map1 = new HashMap<>();
        map1.put(new Employee(1, "DIP", "Comp", 500000), 10);
        map1.put(new Employee(3, "Ram", "IT", 1500000), 30);
        map1.put(new Employee(2, "Zee", "Civil", 100000), 20);

        map1.entrySet().stream()
                .sorted(Map.Entry.comparingByKey((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())))
                .forEach(System.out::println);

        map1.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
                .forEach(System.out::println);


        Map<Employee,Integer> treeMap1 = new TreeMap<>(Comparator.comparing(Employee::getDept));
        treeMap1.put(new Employee(1, "DIP", "Comp", 500000), 10);
        treeMap1.put(new Employee(3, "Ram", "IT", 1500000), 30);
        treeMap1.put(new Employee(2, "Zee", "Civil", 100000), 20);

        System.out.println("Treemap->"+treeMap1);


        Set<Employee> s= new TreeSet<>(Comparator.comparing(Employee::getId));
        s.add(new Employee(3, "DIP", "Comp", 500000));
        s.add(new Employee(2, "DIP", "Comp", 500000));
        s.add(new Employee(1, "DIP", "Comp", 500000));

        System.out.println("Treeset->"+s);




    }
}
