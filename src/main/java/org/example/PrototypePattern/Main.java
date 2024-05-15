package org.example.PrototypePattern;

public class Main {
    public static void main(String args[]){

        Student obj = new Student(20,12,"Ayush");
        Student cloneObj = (Student) obj.Clone();
        System.out.println(cloneObj.toString());
    }
}
