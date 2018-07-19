package com.runnersPages;

import Selenium.core.WebDriverTestBase;
import Selenium.pages.ThomasHome;
import Selenium.pages.ThomasResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThomasCookRunner extends WebDriverTestBase{
    private String domain = "https://www.thomascook.com/";
    public String searchText = "Liverpool";

    @Test
    public void thomasRunner(){
        ThomasHome th = new ThomasHome(webDriver);
        webDriver.get(domain);
        th.clickTextFrom();
        th.chooseAirport();
        th.searchDistationsFrom();
        th.clickAfterText();
        th.clickSearchButton();
        ThomasResultPage trp = new ThomasResultPage(webDriver);
        Assert.assertTrue(trp.getLink().getText().contains(searchText));

    }

}
