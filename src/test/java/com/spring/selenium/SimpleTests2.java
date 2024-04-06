package com.spring.selenium;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
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


//        Queue<String> queue=new ArrayDeque<>();
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(9);
        queue.add(39);
        queue.add(1);
        System.out.println(queue);
        queue.poll();
        System.out.println("removed top element "+queue);
        System.out.println("1st element "+queue.peek());
        System.out.println(queue);
        Stack<String> stack = new Stack<String>();
        stack.push("abc");
        stack.add("fgh");
        System.out.println(stack);

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(66);
        list.add(6);
        System.out.println("Max "+list.stream().max(Comparator.naturalOrder()));
        System.out.println("index get "+list.get(3));
        System.out.println(list);
        System.out.println( list.equals(queue));
ListIterator<Integer> integerIterator=list.listIterator();
while (integerIterator.hasNext()){
    System.out.println("element of index  "+integerIterator.nextIndex()+" is "+integerIterator.next());
}
list.set(0,1000);
        System.out.println(list);

        list.remove(list.get(0));
        System.out.println("list.remove(list.get(0))  "+list);
        System.out.println(list.get(0).hashCode());
        System.out.println("a".hashCode());

    }

    @Test
    public void functionalPgm(){
        List<String> list=new ArrayList<>(List.of("abc","flower","carpter"));
        list.add("edgh");
        System.out.println(list.toString());
        System.out.println(list.stream().findFirst());
        System.out.println( );

        list.stream().forEach(
                element ->System.out.println(element)
        );

        System.out.println("Filter using functional paramters " );
        list.stream().
                filter(element -> element.startsWith("ca"))
                .forEach(element->System.out.println(element));

        list.stream()
                .filter(element-> element.equals("flower"))
                .forEach(element ->
                        {System.out.println("checking equals condition ");
                        System.out.println(element);}
                );


        //find sume of  numbers

        List<Integer> integers=new ArrayList<>(List.of(2,4,1,2,3));
       Integer sum= integers.stream()
                .reduce(
                        0,
                        (element1,element2) -> element1+element2
                );
        System.out.println(sum);


        //find sum of even numbers

        List<Integer> integers1=new ArrayList<>(List.of(2,4,1,2,3));
        Integer sumEven= integers1.stream()
                .filter(element->element%2==0)
                .reduce(
                        0,
                        (element1,element2) -> element1+element2
                );
        System.out.println(sumEven);


  }


    @Test
    public void test1(){


//        Hashtable hashtable=new Hashtable();
//        HashMap hashMap;
//
//        List<String> list=new ArrayList<>(List.of("India","is","my","country"));
//        list.stream().forEach(element -> System.out.print(element));

       List<Integer> integerList=new ArrayList<>(List.of(55,55,43,6,21));
        Integer sum=integerList.stream()
                .reduce(1000,
        (el1,el2)->(el1-el2)


        );
        System.out.println(sum);
        System.err.println("abc");

String s1="abc";
String s2="abc";
if(s1==s2){
    System.out.println("same value");
}
        System.out.println(String.join("/ /",s1,s2));



HashMap<Integer,String> hm;
Integer i1=new Integer('a');
        System.out.println(i1);

char c='G';
if(c>97){
    System.out.println("lower case char");
} else if (c>65 & c<96) {
    System.out.println("upper case char");
} else if (c<58) {
    System.out.println("number");
}
        Integer integer1 = new Integer("111");
        System.out.println(integer1);
        Integer integer2 = new Integer("111");
        System.out.println(integer2);


        System.out.println(integer1==integer2);
        System.out.println(integer1.equals(integer2));

        Integer integer3 = Integer.valueOf("111");
        Integer integer4 = Integer.valueOf("111");
        System.out.println(integer3==integer4);
        System.out.println(integer3.equals(integer4));

String s3=new String("dfg");
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Madrid"));
        Date currentDate = calendar.getTime();
        System.out.println(currentDate);
    }

    @Test
    public void simpletest2(){
        int[] intarr;
        intarr= new int[6];
        for (int numbers:
        intarr) {
            System.out.println(numbers);
        }

    }

}
