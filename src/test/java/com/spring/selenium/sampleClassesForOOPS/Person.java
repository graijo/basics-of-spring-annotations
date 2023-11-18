package com.spring.selenium.sampleClassesForOOPS;

public class Person {
    String name;
    public Person() {
        System.out.println("Super class constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
