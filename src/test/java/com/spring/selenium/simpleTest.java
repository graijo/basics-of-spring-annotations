package com.spring.selenium;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Logger;

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
}
