package com.google;


import Selenium.core.WebDriverTestBase;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vitaliy on 17.05.2018.
 */
public class W3SchoolDragAnd extends WebDriverTestBase{
    public String domain = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop";

    By selectImg = By.xpath("//*[@id=\"drag1\"]");
    By dropDistance = By.xpath("//*[@id=\"div1\"]");

    public WebElement fromElem;
    public WebElement toElem;



    @Test
    public void drugAndDrop(){



        webDriver.get(domain);
        webDriver.switchTo().frame("iframe");
        fromElem = webDriver.findElement(selectImg);
        toElem = webDriver.findElement(dropDistance);
        Actions builder = new Actions(webDriver);

        Action dragAndDrop = builder.clickAndHold(fromElem).moveToElement(toElem).release(toElem).build();


        dragAndDrop.perform();






    }


}
