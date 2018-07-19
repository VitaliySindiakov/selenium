package com.runnersPages;

import Selenium.BookingPages.BookingHome;
import Selenium.BookingPages.BookingResultPage;
import Selenium.core.WebDriverTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingSearchFly extends WebDriverTestBase {
    private String domain = "https://www.booking.com";
    private String city = "New York";


    @Test
    public void goToTheBooking(){
        webDriver.get(domain);
        webDriver.navigate().refresh();
        BookingHome bkh = new BookingHome(webDriver);
        BookingResultPage bkr = new BookingResultPage(webDriver);
        bkh.changeLanguage();

        bkh.setSearchfield(city);
        bkh.firstDateSelect();
        bkh.secondDateSelect();
        bkh.searchButton();

        Assert.assertTrue(bkr.getLink().getText().contains(city));

    }
}
