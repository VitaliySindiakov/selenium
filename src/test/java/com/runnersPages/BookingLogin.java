package com.runnersPages;

import Selenium.BookingPages.BookingHome;
import Selenium.core.WebDriverTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vitaliy on 08.07.2018.
 */
public class BookingLogin extends WebDriverTestBase{
    private String domain = "https://www.booking.com";
    private String mail = "rla98026@sawoe.com";
    private String password = "Ab12345!";
    private String name = "Vitaliy";


    @Test
    public void logMePls(){
        BookingHome bkh = new BookingHome(webDriver);
        webDriver.get(domain);
        webDriver.navigate().refresh();
        bkh.clickloginButton();
        bkh.mailField(mail);
        bkh.passField(password);


        Assert.assertTrue(bkh.getLink().getText().contains(name));

    }
}
