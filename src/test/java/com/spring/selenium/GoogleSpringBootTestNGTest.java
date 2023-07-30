package com.spring.selenium;

import com.spring.selenium.pages.GooglePage;
import com.spring.selenium.util.ScreenshotUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;

import java.io.IOException;

public class GoogleSpringBootTestNGTest extends BaseTest{
    @Lazy
    @Autowired
    ScreenshotUtil screenshotUtil;

    @Autowired
    private GooglePage googlePage;
    @Test
    public void searchResultCheck() throws IOException {
        googlePage.openBrowserAndGoTo();
       Assert.assertTrue(googlePage.isAt(),"Google search page loaded");
        googlePage.getGoogleSearch().search("testing");
        Assert.assertTrue(googlePage.getGoogleSearchResults().isAt(),"Some Results are loading");
        Assert.assertTrue( googlePage.getGoogleSearchResults().getResultCount()>2,"Results found");
        screenshotUtil.takePageScreenShot();
    }
}
