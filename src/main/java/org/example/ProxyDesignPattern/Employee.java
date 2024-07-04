package org.example.ProxyDesignPattern;

public class Employee {
    int Id;
    int Salary;

    public Employee(int id, int salary) {
        Id = id;
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Salary=" + Salary +
                '}';
    }
}
