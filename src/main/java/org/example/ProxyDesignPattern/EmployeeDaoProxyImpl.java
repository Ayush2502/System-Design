package org.example.ProxyDesignPattern;

public class EmployeeDaoProxyImpl implements EmployeeDao{
    EmployeeDao obj1;

    EmployeeDaoProxyImpl(){
        obj1 = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("Admin")){
        obj1.create(client,obj);
        }
        else{
            throw new Exception("Access Denied");
        }
    }
    @Override
    public void delete(String client,int id) throws Exception {
    if(client.equals("Admin")){
        obj1.delete(client,id);
    }
    else{
        throw new Exception("Access Denied");
    }
    }

    @Override
    public Employee findById(String client,int id) throws Exception {
        if(client.equals("Admin") || client.equals("Users")){
            return new Employee(id,10000);}
        else{
            throw new Exception("Access Denied");
        }
    }
}
