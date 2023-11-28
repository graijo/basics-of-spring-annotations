package com.spring.selenium.sampleClassesForOOPS.intefaceFolder;

public class GeneralInterNational1 implements ForeignInterNational {
//    @Override
//    public void applyVisa() {
//        System.out.println("2nd General implementation for Interface method - applyVisa");
//    }

    @Override
    public String applyVisa(String a) {
        System.out.println("2nd General implementation for Interface method - applyVisa");
        return "2nd General implementation for Interface method - applyVisa  with return type and arguments "+a;
    }

    @Override
    public void findCollege() {
        System.out.println("2nd General implementation for Interface method - findCollege");
    }
}
