package com.spring.selenium.sampleClassesForOOPS.intefaceFolder;

public class GeneralInterNational implements ForeignInterNational {
    @Override
    public void applyVisa() {
        System.out.println("General implementation for Interface method - applyVisa");
    }

    @Override
    public void findCollege() {
        System.out.println("General implementation for Interface method - findCollege");
    }
}
