package com.runnersPages;


import Selenium.GooglePages.GoogleMailEnter;
import Selenium.GooglePages.GooglePassNextButton;
import Selenium.GooglePages.GooglePassPage;
import Selenium.core.WebDriverTestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Gmail extends WebDriverTestBase{
    private String domainname = "https://www.google.com.ua/gmail";
    private String name = "test.autotester@gmail.com\n";
    private String password = "Ab12345!";


    @Test
    public void googleLogin()  {
        GoogleMailEnter googleMailEnter = new GoogleMailEnter(webDriver);
        GooglePassPage googlePassPage = new GooglePassPage(webDriver);
        GooglePassNextButton googlePassNextButton = new GooglePassNextButton(webDriver );

        webDriver.get(domainname);
        googleMailEnter.signUpButton(name);

        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile,
                    new File("c:\\failed\\filename"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        googlePassPage.inputField(password);
        googlePassNextButton.passButton();


    }
}
