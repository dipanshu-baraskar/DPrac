package com.j8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeQueries {
    public static void main(String[] args) {
        //average salary of IT dept emp
        List<Employee> employees = EmployeeDatabase.getEmployees();
        Double it = employees.stream()
                .filter(employee -> employee.getDept().equals("IT"))
                .map(employee -> employee.getSalary())
                .mapToDouble(value -> value)
                .average()
                .getAsDouble();
        System.out.println(it);

        List<Employee> collect = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .limit(2).collect(Collectors.toList());
        System.out.println(collect);


        // write code in Java 8 style to get the sum of the squares of all the odd numbers in the array.

        List<Integer> list = Arrays.asList(4, 2, 1, 4, 5);
        Integer i = list.stream().filter(n -> n % 2 != 0).map(n -> n * n).reduce(0, (a, b) -> a + b);
        System.out.println(i);

        int sum = list.stream().filter(n -> n % 2 != 0).map(n -> n * n).mapToInt(n -> n).sum();

        System.out.println(sum);


    }
}
