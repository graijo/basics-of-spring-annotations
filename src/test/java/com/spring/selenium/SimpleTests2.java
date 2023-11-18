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

        Hashtable<String ,Integer> ht=new Hashtable<>();
        ht.put("1",11);

        TreeSet<String> geekTreeSet = new TreeSet<>();
        geekTreeSet.add("123");
        geekTreeSet.addAll(List.of("34000", "wer","0","1","67","true"));
        //Format specifiers
        System.out.printf("geekTreeSet is %s ",geekTreeSet);
        System.out.printf("integer is %d \n",5);

        System.out.println("geekTreeSet ceiling is "+geekTreeSet.ceiling("3"));
        HashSet<String> geekHashSet = new HashSet<String>();
        int a=5,b=10;
        if(a>6 && b>9){
            System.out.println("Lazy evaluation by && relational operator");
        }
        if(a>6 & b>9){
            System.out.println("No Lazy evaluation by & relational operator");
        }

        int i=20;
        if(i>15){
            System.out.println("1st if block--if multiple if or else if blocks true,only 1st block with true will be executed");
        } else if (i>19) {
            System.out.println("2nd if block");
        }
        else if (i>18) {
            System.out.println("3rd if block");
        }

        char c='A';
        switch (c){
            case 'C':
                System.out.println("Cc");
                break;
            case 'A':
                System.out.println("Aa");
                break;
            case 'B':
                System.out.println("Bb");
                break;

        }


        String s=String.join(" ","helow","world","222","3rd string");
        System.out.println(s);
        System.out.println(s.concat(" abc"));


    }

    @Test
    public void listTests2(){

        List<Integer> listInt=new ArrayList<>(List.of(2,55,23,4));
        Float f1=Float.valueOf("55");
        System.out.println(f1);
//        List<int> listInt2=new ArrayList<>();

        char[] cArr=new char[4];
        System.out.println(Arrays.toString(cArr));
                int[] iArr=new int[2];
        System.out.println(Arrays.toString(iArr));
        System.out.println(iArr.toString());


        Character[] characters=new Character[5];
//        Arrays.sort(characters);
        String  s2[]=new String[2] ;
        int[] i2=new int[]{1,3,4,5};
        char[] c2=new char[]{'d','g'};
        System.out.println(Arrays.stream(s2).toList());

        System.arraycopy(c2,0,cArr,0,2);
    }


}
