package com.runnersPages;

import Selenium.StylusPages.StylusNaitiButton;
import Selenium.StylusPages.StylusSerachField;
import Selenium.StylusPages.StylusVerify;
import Selenium.core.WebDriverTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Stylus extends WebDriverTestBase {
    private String domain = "http://stylus.com.ua/";
    private String searchresult = "Sony";


@Test
    public void styolusMagaz(){
    webDriver.get(domain);

    StylusSerachField stylusSerachField = new StylusSerachField(webDriver);
    stylusSerachField.inputTextField(searchresult);

    StylusNaitiButton stylusNaitiButton = new StylusNaitiButton(webDriver);
    stylusNaitiButton.setNaitiButton();


    StylusVerify stylusVerify = new StylusVerify(webDriver);
    Assert.assertTrue(stylusVerify.getLink().getText().contains(searchresult));


}
}

