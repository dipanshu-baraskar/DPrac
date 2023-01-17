package com.j8;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTaxService {
    public static List<Employee> evaluateTaxUsers(String s) {
        return s.equals("tax") ?
                EmployeeDatabase.getEmployees().stream().filter(e -> e.getSalary() > 500000).collect(Collectors.toList())
                :
                EmployeeDatabase.getEmployees().stream().filter(e -> e.getSalary() < 500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List l = EmployeeTaxService.evaluateTaxUsers("non tax");
        System.out.println(l);
    }
}
