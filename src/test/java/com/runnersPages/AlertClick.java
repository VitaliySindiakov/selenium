package com.runnersPages;

import Selenium.core.WebDriverTestBase;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vitaliy on 22.05.2018.
 */
public class AlertClick extends WebDriverTestBase {

    private String domain = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
    private String searchText = "OK";
    By TryItButton = By.xpath("/html/body/button");
    By TryCss = By.cssSelector("body > button");

    By textsccept = By.xpath("//*[@id=\"demo\"]");
    private String id = "myFunction()";

    WebElement clickOk;
    WebElement text;
    WebElement javaScript;

    @Test
      public void AlertOkButton(){
        webDriver.get(domain);
        webDriver.switchTo().frame("iframeResult");
//        clickOk = webDriver.findElement(TryItButton);
//        clickOk.click();
        javaScript = (WebElement)((JavascriptExecutor)webDriver)
                .executeScript("document.querySelector(\"h2+button\").click()");

        Alert alert1 = webDriver.switchTo().alert();
        alert1.accept();


        Assert.assertTrue(getLink().getText().contains(searchText));
    }
    public WebElement getLink(){
        text = webDriver.findElement(textsccept);
        return text;

    }



}
