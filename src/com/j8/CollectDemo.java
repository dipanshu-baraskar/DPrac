package com.j8;

import java.util.*;
import java.util.stream.Collectors;

public class CollectDemo {

    public static class Employee {
        int id;
        String name;
        String dept;

        public Employee(int id, String name, String dept) {
            this.id = id;
            this.name = name;
            this.dept = dept;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", dept='" + dept + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<String> ss = Arrays.asList("amit", "ammy", "kamlesh", "zubin");
        Map<Character, Set<String>> collect = ss.stream().collect(Collectors.groupingBy(s -> s.charAt(0), TreeMap::new, Collectors.toSet()));
        Map<Character, Set<String>> collect2 = ss.stream().collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.toSet()));
        Map<Character, Set<String>> collect3 = ss.stream().collect(Collectors.groupingBy(s -> s.charAt(0), TreeMap::new, Collectors.toSet()));
        System.out.println(collect);

        List<Employee> employeeList = Arrays.asList(new Employee(1, "Dip", "IT"),
                new Employee(2, "Ram", "Comp"),
                new Employee(3, "Shyam", "Comp"));

        Map<String, List<Employee>> empSor = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDept()));
        System.out.println(empSor);

        Map<String, List<String>> empSor2 = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDept(),
                Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(empSor2);


    }

}
