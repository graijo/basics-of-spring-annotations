package com.spring.selenium;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class simpleTest  extends BaseTest{
//    Logger logger=new Logger(simpleTest.class);
    Logger logger=Logger.getLogger(String.valueOf(simpleTest.class));

    @Test
    public void readDataFromSrcFile() throws IOException {
//        ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
//        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream
//                ("resources/inputdata.csv");
        InputStream inputStream=simpleTest.class.getClassLoader().getResourceAsStream
                ("inputdata.csv");

//        URL url = getClass().getResource
//                ("/src/test/resource/inputdata.csv");
//        InputStream inputStream = url.openStream();

//                InputStream inputStream=Thread.currentThread().getContextClassLoader().getResourceAsStream
//                ("\\src\\main\\resources\\inputdata.csv");
//        URL url = Paths.get("target", "/src/main/resources/inputdata.csv").toUri().toURL();
//        InputStream inputStream=Thread.currentThread().getContextClassLoader().getResourceAsStream("/inputdata.csv");

//        URL test1 = getClass().getResource("/");
//        URL test2 = getClass().getClassLoader().getResource("/");
//        URL test3 = getClass().getClassLoader().getResource("../");

//        logger.info(test1.getPath());
//        logger.info(test2.getPath());
//        logger.info(test3.getPath());
        System.out.println(inputStream);
        StringBuilder inputContent=new StringBuilder();
        assert inputStream!=null;
        Scanner scanner=new Scanner(inputStream).useDelimiter("\\n");
        while(scanner.hasNext()){
            inputContent.append(scanner.nextLine());
        }
        System.out.println("1 "+inputStream);
        System.out.println("2 "+inputContent);
        System.out.println("3 "+inputContent.toString());
        System.out.println("4 "+inputStream.read());
        System.out.println("5 "+inputStream.read());
        logger.info("3 "+inputContent.toString());
    }

    @Test
    public void printPattern(){
        int i;
        for(int row=0;row<=7;row++){
            i=0;
            for(int column=0;column<=row;column++){
                System.out.print(i);
                i++;
            }
            System.out.println();

        }

        for(int row=0;row<=7;row++){
            i=0;
            for(int column=7;column>=row;column--){
                System.out.print(i);
                i++;
            }
            System.out.println();

        }

    }

    @Test
    public void separateSpecialChars(){
        String input="asdf ghjk ewrtyu gfh@#$%^&12 345678 ";
        String resSpecial="";
        String resNonSpecial="";
        String regEx="[a-zA-Z0-9]";
        for(int i=0;i<input.length();i++){
            if((String.valueOf(input.charAt(i))).matches(regEx)){

                resNonSpecial=resNonSpecial+String.valueOf(input.charAt(i));
            }
            else
            {
                resSpecial=resSpecial+String.valueOf(input.charAt(i));
            }
        }
        System.out.println("Spcial chars are "+resSpecial);
        System.out.println(" chars are "+resNonSpecial);

        input=input.replaceAll(regEx,"");
        System.out.println("non specs removed "+input);
    }

    @Test
    public void maxOccuringChar(){
        String input="sadfghjhgfd bbbb wee";
        String[] stringArr=input.split(""); //convert string to array

        String maxElement = null;
        int maxCount=0;
        int currentCount;
        // iteratively traversing
        for(int i=0;i<stringArr.length;i++)
        {            //traverse string array and get 1 element
             currentCount=0;         //reset current count to zero
            for(int j=0;j< stringArr.length;j++){   // traverse same array
                if(stringArr[i].equals(stringArr[j])){     //compare 1 element with rest of the element in the array
                    currentCount++;                         //=operator gives 1st element as most,so use equals method
                }
                if(currentCount>maxCount){    //if count of current element is greater than maxCount
                    maxCount=currentCount;
                    maxElement=stringArr[i];
                }

            }
            System.out.println("Count of  "+stringArr[i]+ " is "+currentCount);
        }


        System.out.println("String Array to string is "+ String.join("",stringArr));
        System.out.println("  to string is "+ stringArr.toString());
        System.out.println("Most occuring element is ="+maxElement+" - count is "+maxCount);
    }
    @Test
    public void minOccuringChar(){
        String input="sadfghjhgfd bbbbsaffggg wee";
        String[] stringArr=input.split(""); //convert string to array

        String maxElement = null;
        int minCount=0;
        int currentCount;
        for(int i=0;i<stringArr.length;i++)
        {            //traverse string array and get 1 element
            currentCount=0;         //reset current count to zero
            for(int j=0;j< stringArr.length;j++){   // traverse same array
                if(stringArr[i].equals(stringArr[j])){     //compare 1 element with rest of the element in the array
                    ++currentCount;                         //=operator gives 1st element as most,so use equals method
                }

                if(currentCount<minCount || i==0 && j==0){
                    minCount=currentCount;
                    maxElement=stringArr[i];
                }


            }
        }


        System.out.println("String Array to string is "+ String.join("",stringArr));
        System.out.println("  to string is "+ stringArr.toString());
        System.out.println("Least occuring element is ="+maxElement+" - count is "+minCount);
    }

    @Test
    public void occuranceOfCharacters(){
         String input="sdfghjk cxvbnvbvbnb uyyyuuy wwwwwww";
         String[] strArray=input.split("");

        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<strArray.length;i++){
            if(map.containsKey(strArray[i])){

                map.put(strArray[i],map.get(strArray[i])+1);
            }
            else
            {
                map.put(strArray[i],1);
            }
        }
         System.out.println("=============Using EntrySet===================");
        for(Map.Entry<String,Integer> entry :map.entrySet()){
            System.out.println("Key "+entry.getKey()+", Value "+entry.getValue());
        }
        System.out.println("=============Using KeySet-some results omitted as Set dont allow duplicate========");
        Iterator<String> iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println("#2 Key "+iterator.next()+", Value "+map.get(iterator.next()));
        }
        System.out.println("=============Using Values===================");
        Iterator<Integer> iterator1=map.values().iterator();
        while (iterator1.hasNext()){
            System.out.println( "#3 Value are "+iterator1.next());
        }

    }
    @Test
    public void countHowManyTimesACharInAString() {
        String input = "sdfghjk cxvbnvbvbnb uyyyuuy wwwwwww bnn";
        String[] strArray = input.split("");
        char c='w';
        int count=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Occurance of char "+c+" is "+count);
    }

    @Test
    public void findOccuranceUsingRegularExpression() {
        String input = "sdfghjk cxvbnvbvbnb uyyyuuy wwwwwww bnn";
        Pattern pattern = Pattern.compile("[w]");
        Matcher matcher = pattern.matcher("www.scaler.com/topics");
        int count = 0;

        while (matcher.find()) {
            count++;
        }
        System.out.println("Occurrences: " + count);
        long count1=input.chars().filter(cb->cb=='w').count();
        System.out.println("Occurrences using java 8: " + count1);
    }


@Test
    public void sort(){
        Integer [] a= {1,99999999,1,66,43,9,66,90,1000};
        int temp;
        for(int i=0;i<a.length;i++){        //1st for to traverse array from begining
            for(int j=i+1;j<a.length;j++){      //inner for to traverse array from next element onwards
                if(a[i]>a[j]){          //check current element is greater than next element
                    temp=a[i];          //swap current and next if current is large
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    System.out.println("Sorted array is ");
        for(int a1:a) {
            System.out.print(a1+" ");
        }

    System.out.println("Reverse Sorted array is ");
        Arrays.sort(a,Collections.reverseOrder());
    for(int a1:a) {
        System.out.print(a1+" ");
    }
}
@Test
    public void trianglePattern(){

    int rows =10;

    for(int i=0;i<rows;i++){
        for(int j=rows;j>=i;j--){ //1st inner loop from total row till current row
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){     //2nd inner loop from 0 till current row
            System.out.print("* ");
        }
        System.out.println();
    }



    int i, j, row = 6;
//Outer loop work for rows
    for (i=0; i<row; i++)
    {
//inner loop work for space
        for (j=row-i; j>1; j--)
        {
//prints space between two stars
            System.out.print(" ");
        }
//inner loop for columns
        for (j=0; j<=i; j++ )
        {
//prints star
            System.out.print("* ");
        }
//throws the cursor in a new line after printing each line
        System.out.println();
    }

}

 }
