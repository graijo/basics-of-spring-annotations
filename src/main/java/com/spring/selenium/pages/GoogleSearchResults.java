package com.spring.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GoogleSearchResults extends BasePage{


    @FindBy(className = ("MjjYud"))
    private List<WebElement> searchResult;

    public int getResultCount(){
        return searchResult.size();
    }
    @Override
    public boolean isAt() {
        return webDriverWait.until((driver)->!searchResult.isEmpty());

    }
}
