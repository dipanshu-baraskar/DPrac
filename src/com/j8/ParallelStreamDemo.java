package com.j8;

import java.util.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            employees.add(new Employee(i, "emp" + i, "NA", Long.valueOf(Math.abs(new Random().nextInt()))));
        }

        long start, end;
        start = System.currentTimeMillis();
        employees.stream().map(Employee::getSalary).mapToLong(s -> s).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("for seq stream:" + (end - start));
        System.out.println("====================================");
        start = System.currentTimeMillis();
        employees.parallelStream().map(Employee::getSalary).mapToLong(s -> s).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("for parallel stream:" + (end - start));
        System.out.println("*********************************");

        start = System.currentTimeMillis();
        employees.stream().forEach(x -> System.out.println(Thread.currentThread().getName() + "->" + x.getId()));
        end = System.currentTimeMillis();
        System.out.println("for seq stream:" + (end - start));
        System.out.println("====================================");
        start = System.currentTimeMillis();
        employees.parallelStream().forEach(x -> System.out.println(Thread.currentThread().getName() + "->" + x.getId()));
        end = System.currentTimeMillis();
        System.out.println("for parallel stream:" + (end - start));

    }
}
