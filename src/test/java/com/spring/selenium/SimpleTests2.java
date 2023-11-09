package com.spring.selenium;

import org.junit.jupiter.api.Test;

import java.util.*;

public class SimpleTests2 {

    @Test
    public void arrayListTest(){
        ArrayList list1=new ArrayList(Arrays.asList("abc",34,"tan"));
        int[] intArr=new int[]{1,2,3};
        list1.add(1);
        list1.add(true);
        list1.add("Sunday");

        System.out.println(list1);
        System.out.println("Index of non existing element "+list1.indexOf("tue"));
        System.out.println("Index of existing element "+list1.indexOf("Sunday"));

        list1.add(0,"Friday");
        System.out.println("After addition in 0th index in array "+ list1);

        list1.set(0,"Friday1");
        System.out.println("After replacement in 0th index in array "+ list1);

        //initialize list with static method List.of
        List list2=List.of(1,4,5);
        System.out.println("initialize list with static method List.of  "+ list2);
//        list2.add(6);   will throw immutable exception
        List list3=new ArrayList<>(List.of(1,4,5,"2342","sdsdf"));
        System.out.println("initialize list with static method List.of  "+ list3);
        list3.add(6);

        boolean b = list3.get(3) instanceof Integer;
        System.out.println("wrapper of the value in list is Integer "+b);

        List<Integer> l2=new ArrayList<>();
    }

    @Test
    public void hashTests(){

        Set<String> hashSet1=new HashSet<>();
        hashSet1.add("243");
        System.out.println("Set is "+hashSet1);
        hashSet1.add("243");
        System.out.println("After Set is "+hashSet1);
        hashSet1.add("4");
        System.out.println("After Set is "+hashSet1);
    }
}
