package com.spring.selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoogleSearch extends BasePage {

    //    @FindBy(xpath = ("//textarea[@title='Search']"))
    @FindBy(name = "q")
    private WebElement searchBox;

//    @FindBy(name = "btnk")
    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")
    private WebElement searchbtn;


    public void search(String searchWord){
        this.searchBox.sendKeys(searchWord);
        searchBox.sendKeys(Keys.TAB);
        searchbtn.click();

//        searchbtn.stream()
//                .filter(e -> e.isDisplayed() && e.isEnabled())
//                .findFirst()
//                .ifPresent(WebElement::click);
    }


    @Override
    public boolean isAt() {
        return this.webDriverWait.until((driver) -> this.searchBox.isDisplayed());
    }
}
