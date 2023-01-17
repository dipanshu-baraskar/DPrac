package com.j8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 3, 5, 7, 8, 4, 1, 2, 5);
        list.stream().sorted().forEach(System.out::print);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        List<Employee> employees = EmployeeDatabase.getEmployees();

        //desc order
        employees.stream()
                .sorted(((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())))
                .forEach(System.out::println);

        //asc order
        employees.stream()
                .sorted(((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())))
                .forEach(System.out::println);

        //asc order
        employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getName()))
                .forEach(System.out::println);

        //asc order
        employees.stream()
                .sorted(Comparator.comparing(Employee::getId))
                .forEach(System.out::println);

    }
}
