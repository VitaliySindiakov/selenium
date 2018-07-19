package com.runnersPages;


import Selenium.BookingPages.BookingHome;
import Selenium.BookingPages.CabinetPage;
import Selenium.core.WebDriverTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingCabinet extends WebDriverTestBase {
    private String domain = "https://www.booking.com";
    private String mail = "rla98026@sawoe.com";
    private String password = "Ab12345!";
    private String cityStart = "Kiev";

    @Test
    public void CabinetChange() {
        BookingHome bkh = new BookingHome(webDriver);
        CabinetPage cbp = new CabinetPage(webDriver);
        webDriver.get(domain);
        webDriver.navigate().refresh();
        bkh.changeLanguage();
        bkh.clickloginButton();
        bkh.mailField(mail);
        bkh.passField(password);
        cbp.goToCabinet();
        cbp.registrartion();
        cbp.setStartPoint(cityStart);
        cbp.firstData();
        cbp.secondData();
        cbp.childrenChange();

        cbp.submitButton();

        Assert.assertTrue(cbp.getLink().getText().contains(cityStart));


    }
}
