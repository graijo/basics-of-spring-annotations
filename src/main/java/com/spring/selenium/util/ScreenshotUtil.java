package com.spring.selenium.util;

import jakarta.annotation.PostConstruct;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
@Lazy
@Component
public class ScreenshotUtil {
//    @Autowired
//    WebDriver driver;

    @Autowired
    TakesScreenshot takesScreenshot;
    @Value("${screenshotSavepath}/img.png")
    String filePath;

    public void takePageScreenShot() throws IOException {
        File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
//        FileCopyUtils.copy(sourceFile,filePath.toFile());
        File DestFile=new File(filePath);
        FileCopyUtils.copy(sourceFile,DestFile);


//        TakesScreenshot scrShot =((TakesScreenshot)driver);
//        //Call getScreenshotAs method to create image file
//        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//        //Move image file to new destination
//        String filePath = "e://WORK/delete/test.png";
//        File DestFile=new File(String.valueOf(filePath));
//        //Copy file at destination
//        FileUtils.copyFile(SrcFile, DestFile);
    }

    @PostConstruct
    public void delay() throws InterruptedException {
        for(int i=0;i<3;i++)
        {
            Thread.sleep(1000);
            System.out.println("Sleeping");
        }
    }


}
