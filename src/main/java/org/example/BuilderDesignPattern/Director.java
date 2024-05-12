package org.example.BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudentBuilder();
        }
        else{
            return createMBAStudentBuilder();
        }
    }

    private Student createMBAStudentBuilder() {
        return studentBuilder
                .setRollNumber(1)
                .setAge(24)
                .setName("Rony")
                .setFatherName("Samuel")
                .setMotherName("Alize")
                .setSubjects()
                .build();
    }

    private Student createEngineeringStudentBuilder() {
        return studentBuilder
                .setRollNumber(2)
                .setAge(25)
                .setName("Ayush")
                .setFatherName("Anil")
                .setMotherName("Suman")
                .setSubjects()
                .build();
    }

}
