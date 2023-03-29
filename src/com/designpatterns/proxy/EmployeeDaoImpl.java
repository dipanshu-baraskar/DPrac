package com.designpatterns.proxy;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, EmployeeDao obj) throws Exception {
        System.out.println("Created Employee");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        System.out.println("Deleted emp " + empId);
    }

    @Override
    public EmployeeDao get(String client, int empId) throws Exception {
        System.out.println("Fetching record");
        return new EmployeeDaoImpl();
    }
}
