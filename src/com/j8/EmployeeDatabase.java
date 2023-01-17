package com.j8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> getEmployees(){
        List<Employee> list= new ArrayList<>();
        list.add(new Employee(1,"Dip","IT",1000000));
        list.add(new Employee(2,"Ram","Mech",500000));
        list.add(new Employee(3,"Rak","Comp",7500000));
        list.add(new Employee(4,"Sam","IT",6000000));
        list.add(new Employee(5,"Tom","IT",50000));
        return list;
    }
}
