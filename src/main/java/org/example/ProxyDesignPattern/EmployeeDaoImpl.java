package org.example.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Creater New Row");
    }

    @Override
    public void delete(String client,int id) throws Exception {
        System.out.println("Row Deleted");
    }

    @Override
    public Employee findById(String client,int id) throws Exception {
        System.out.println("Fetching Data from db");
        return new Employee(id,10000);
    }
}
