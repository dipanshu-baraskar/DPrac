package com.designpatterns.proxy;

public class Client {
    public static void main(String[] args) {
        EmployeeDao emp1= new EmployeeDaoProxy();
        try {
            emp1.create("USER",new EmployeeDaoImpl());
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
