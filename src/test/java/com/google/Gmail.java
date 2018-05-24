package com.google;


import Selenium.Home.GooglePages.GoogleMailEnter;
import Selenium.Home.GooglePages.GoogleMailNextButton;
import Selenium.Home.GooglePages.GooglePassNextButton;
import Selenium.Home.GooglePages.GooglePassPage;
import Selenium.core.WebDriverTestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

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
        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile,
                    new File("c:\\failed\\filename"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        //GoogleMailNextButton googleMailNextButton = new GoogleMailNextButton(webDriver);
        //googleMailNextButton.clickNextButton();


        GooglePassPage googlePassPage = new GooglePassPage(webDriver);
        googlePassPage.inputField(password);

        GooglePassNextButton googlePassNextButton = new GooglePassNextButton(webDriver);
        googlePassNextButton.passButton();


    }
}
