package org.example.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        List<String> subs = new ArrayList<>();
        subs.add("DataBase Management System");
        subs.add("Computer Networks");
        subs.add("Theory of Computations");
        this.subjects = subs;
        return this;
    }
}
