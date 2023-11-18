package com.spring.selenium.sampleClassesForOOPS;

import com.spring.selenium.sampleClassesForOOPS.abstractFolder.ForeignStudent;
import com.spring.selenium.sampleClassesForOOPS.abstractFolder.GeneralStudent;
import com.spring.selenium.sampleClassesForOOPS.abstractFolder.GeneralStudent1;
import com.spring.selenium.sampleClassesForOOPS.defaultInterface.ComplexAlgo;
import com.spring.selenium.sampleClassesForOOPS.defaultInterface.ComplexAlgoImplementor;
import com.spring.selenium.sampleClassesForOOPS.intefaceFolder.ForeignInterNational;
import com.spring.selenium.sampleClassesForOOPS.intefaceFolder.GeneralInterNational;
import com.spring.selenium.sampleClassesForOOPS.intefaceFolder.GeneralInterNational1;

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
        //Abstract same method implementation in another class
        ForeignStudent foreignStudent1=new GeneralStudent1();
        foreignStudent1.enterForeignStudentName();

//        Interface
        ForeignInterNational foreignInterNational=new GeneralInterNational();
        foreignInterNational.applyVisa();
        foreignInterNational.findCollege();

        //Interface same method implementation in another class
        foreignInterNational=new GeneralInterNational1();
        foreignInterNational.applyVisa();
        foreignInterNational.findCollege();


        //Default method use in Interface
        ComplexAlgo complexAlgo=new ComplexAlgo() {
        };
        complexAlgo.complexMethod1();

        //OR
        ComplexAlgoImplementor complexAlgoImplementor=new ComplexAlgoImplementor();
        complexAlgoImplementor.complexMethod1();
    }

}
