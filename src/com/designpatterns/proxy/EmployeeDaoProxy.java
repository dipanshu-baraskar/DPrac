package com.designpatterns.proxy;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDao obj) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDao.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDao.delete(client, empId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDao get(String client, int empId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDao.get(client, empId);
        }
        throw new Exception("Access Denied");
    }
}
