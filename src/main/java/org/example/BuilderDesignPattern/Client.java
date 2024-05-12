package org.example.BuilderDesignPattern;

public class Client {
    public static void main(String args[]){
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineering = director1.createStudent();
        Student Mba = director2.createStudent();

        System.out.println(engineering.toString());
        System.out.println(Mba.toString());
    }
}
