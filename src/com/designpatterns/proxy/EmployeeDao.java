package com.designpatterns.proxy;

public interface EmployeeDao {
    void create(String client, EmployeeDao obj) throws Exception;

    void delete(String client, int empId) throws Exception;

    EmployeeDao get(String client, int empId) throws Exception;
}
