package org.example.PrototypePattern;

public class Student implements Prototype{
    int age;
    int rollNumber;
    String name;

    Student(){}

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Prototype Clone() {
        return new Student(age,rollNumber,name);
    }
}
