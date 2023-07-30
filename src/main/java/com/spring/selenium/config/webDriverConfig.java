package com.spring.selenium.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

import java.time.Duration;
@Lazy
@Configuration
public class webDriverConfig {

    @Value("${timeout:30}")
    private int timeout;

    @Bean
    @ConditionalOnProperty(name = "browser",havingValue = "firefox")
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().driverVersion("114.0.2").setup();
        return new FirefoxDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "browser",havingValue = "edge")
    public WebDriver edgedriver(){
        WebDriverManager.edgedriver().driverVersion("10.0.9200.22139").setup();
        return new EdgeDriver();
    }

    @Bean
//    @Primary
    @ConditionalOnMissingBean
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().driverVersion("109.0.5414.25").setup();
        return new ChromeDriver();
    }

    @Bean
    protected WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }
}
