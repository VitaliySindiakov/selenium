package com.google;

import Selenium.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by Vitaliy on 17.05.2018.
 */
public class W3SchoolSelector extends WebDriverTestBase{
    public String domain = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";

    By selectButton = By.xpath("/html/body/select");


    @Test
    public void drugAndDrop(){
        webDriver.get(domain);
        webDriver.switchTo().frame("iframeResult");
        WebElement selector = webDriver.findElement(selectButton);
        selector.click();
        Select select = new Select(selector);
        select.selectByValue("saab");




    }


}
