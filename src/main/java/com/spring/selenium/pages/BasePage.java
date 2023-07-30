package com.spring.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

public abstract class BasePage {

    @Lazy
    @Autowired
    protected WebDriver driver;
    @Lazy
    @Autowired
    protected WebDriverWait webDriverWait;
//    @Bean
//    private void init(){
//        PageFactory.initElements(driver,this);
//    }

    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver, this);
    }
    /*
    To check presence of page
     */
    public abstract boolean isAt();

}
