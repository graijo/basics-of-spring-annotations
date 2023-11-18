package com.spring.selenium.sampleClassesForOOPS;

public class Student extends Person{
    public Student() {
        System.out.println("Sub class constructor");
    }

    @Override
    public void setName(String name) {
        super.setName(name+"_director");
    }
}
