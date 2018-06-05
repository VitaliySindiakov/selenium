package com.google;

import Selenium.core.WebDriverTestBase;
import Selenium.pages.ThomasHome;
import Selenium.pages.ThomasResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vitaliy on 24.05.2018.
 */
public class ThomasCookRunner extends WebDriverTestBase{
    private String domain = "https://www.thomascook.com/";
    public String searchText = "Liverpool";

    @Test
    public void thomasRunner(){
        webDriver.get(domain);
        webDriver.navigate().refresh();
        ThomasHome th = new ThomasHome(webDriver);
        th.clickTextFrom();
        th.chooseAirport();
        th.searchDistationsFrom();
        th.clickAfterText();
        th.clickSearchButton();
        ThomasResultPage trp = new ThomasResultPage(webDriver);
        Assert.assertTrue(trp.getLink().getText().contains(searchText));
//        th.setSearchFrameWhereTo();

//        th.chooseLiverpool();



    }

}
