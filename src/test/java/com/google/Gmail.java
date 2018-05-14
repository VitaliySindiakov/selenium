package com.google;


import Selenium.Home.GooglePages.GoogleMailEnter;
import Selenium.Home.GooglePages.GoogleMailNextButton;
import Selenium.Home.GooglePages.GooglePassNextButton;
import Selenium.Home.GooglePages.GooglePassPage;
import Selenium.core.WebDriverTestBase;
import org.testng.annotations.Test;

/**
 * Created by Vitaliy on 10.05.2018.
 */
public class Gmail extends WebDriverTestBase {
    private String domainname = "https://www.google.com.ua/gmail";

    private String name = "vitaliysindjakov@gmail.com\n";

    private String password = "2284545911199";

    @Test
    public void googleLogin()  {
        webDriver.get(domainname);

        GoogleMailEnter googleMailEnter = new GoogleMailEnter(webDriver);
        googleMailEnter.signUpButton(name);

        //GoogleMailNextButton googleMailNextButton = new GoogleMailNextButton(webDriver);
        //googleMailNextButton.clickNextButton();


        GooglePassPage googlePassPage = new GooglePassPage(webDriver);
        googlePassPage.inputField(password);

        GooglePassNextButton googlePassNextButton = new GooglePassNextButton(webDriver);
        googlePassNextButton.passButton();


    }
}
