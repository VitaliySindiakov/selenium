package com.google;

import Selenium.Home.StylusPages.StylusNaitiButton;
import Selenium.Home.StylusPages.StylusSerachField;
import Selenium.Home.StylusPages.StylusVerify;
import Selenium.core.WebDriverTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Stylus extends WebDriverTestBase {
    private String domain = "http://stylus.com.ua/";
    private String searchresult = "Sony Z2";


@Test
    public void styolusMagaz(){
    webDriver.get(domain);

    StylusSerachField stylusSerachField = new StylusSerachField(webDriver);
    stylusSerachField.inputTextField(searchresult);

    StylusNaitiButton stylusNaitiButton = new StylusNaitiButton(webDriver);
    stylusNaitiButton.setNaitiButton();


    StylusVerify stylusVerify = new StylusVerify(webDriver);
    Assert.assertTrue(stylusVerify.getLink().getText(). contains(searchresult));


}
}

