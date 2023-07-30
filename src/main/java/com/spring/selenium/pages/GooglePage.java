package com.spring.selenium.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends BasePage{

@Autowired
private GoogleSearch googleSearch;

@Autowired
private GoogleSearchResults googleSearchResults;

@Value("${url}")
private String appUrl;

public void openBrowserAndGoTo(){
    driver.get(appUrl);
}

    public GoogleSearch getGoogleSearch() {
        return googleSearch;
    }

    public GoogleSearchResults getGoogleSearchResults() {
        return googleSearchResults;
    }

    @Override
    public boolean isAt() {
        return googleSearch.isAt();
    }
}
