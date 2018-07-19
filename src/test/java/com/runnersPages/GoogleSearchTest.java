package com.runnersPages;

import Selenium.core.PropertiesCache;
import Selenium.core.WebDriverTestBase;
import Selenium.pages.GoogleResultPage;
import Selenium.pages.GoogleSearchPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class GoogleSearchTest extends WebDriverTestBase {

    private String googledomain= String.valueOf(PropertiesCache.getProperty("google.search"));
    private String getGoogleSearch = String.valueOf(PropertiesCache.getProperty("google.searchText"));

    private String googleSearch = googledomain;
    private String searchText = getGoogleSearch;


    @Test
    public void searchTest() {
        webDriver.get(googleSearch);

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(webDriver);

        googleSearchPage.search(searchText);

        GoogleResultPage googleResultPage = new GoogleResultPage(webDriver);

        Assert.assertTrue(googleResultPage.getLink().getText().contains(searchText));
    }

}