package com.spring.selenium.sampleClassesForOOPS.intefaceFolder;

import com.spring.selenium.sampleClassesForOOPS.staticAndPrivateMethodsInInterface.ForeignInterNational0;

public class GeneralInterNational implements ForeignInterNational {

    @Override
    public String applyVisa(String a) {
        System.out.println("General implementation for Interface method - findCollege");
        return "General implementation for Interface method - findCollege with return type and arguments  "+a;
    }

    @Override
    public void findCollege() {
        System.out.println("General implementation for Interface method - findCollege");
    }
}
