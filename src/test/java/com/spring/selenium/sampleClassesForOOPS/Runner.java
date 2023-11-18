package com.spring.selenium.sampleClassesForOOPS;

public class Runner {


    public static void main(String[] arg){

        Student student=new Student();
        boolean b = student instanceof Student;
        boolean b1 = student instanceof Person;
        boolean b2 = student instanceof Object;
        student.setName("Antony");
        System.out.println("New Student name :"+student.getName());
        System.out.println("student instanceof Student :"+ b);
        System.out.println("student instanceof Person :"+ b1);
        System.out.println("student instanceof Object :"+ b2);
        Person person=new Person();
        Person person1=new Student();

//        Abstract
        ForeignStudent foreignStudent=new GeneralStudent();
        foreignStudent.enterForeignStudentName();

//        Interface
        ForeignInterNational foreignInterNational=new GeneralInterNational();
        foreignInterNational.applyVisa();
        foreignInterNational.findCollege();

    }

}
