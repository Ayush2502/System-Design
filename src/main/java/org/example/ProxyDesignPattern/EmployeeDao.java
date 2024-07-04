package org.example.ProxyDesignPattern;

public interface EmployeeDao {

    public void create(String client, Employee obj) throws Exception;
    public void delete(String client, int id) throws  Exception;
    public Employee findById(String client, int id) throws  Exception;
}
