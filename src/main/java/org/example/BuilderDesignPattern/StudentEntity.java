package org.example.BuilderDesignPattern;

import java.util.List;

public class StudentEntity {

    int rollNumber;
    int age;
    String name;
    String fathername;
    String motherName;
    List<String> subjects;

    public StudentEntity() {
    }

    public StudentEntity(int rollNumber, int age, String name, String fathername, String motherName, List<String> subjects) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.fathername = fathername;
        this.motherName = motherName;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }

}
/* This is a classic example where we need to understand and implement the builder pattern .
    Without Builder pattern , we would be requiring to make multiple constructors.
 */

