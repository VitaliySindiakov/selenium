package com.equerest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Created by Vitaliy on 07.06.2018.
 */
public class RegisterPage {
    private WebDriver webDriver;


    public RegisterPage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public void fillFIO(String firstName, String lastName){
        WebElement fio = webDriver.findElement(By.id("fio"));
        fio.sendKeys(firstName + " " + lastName);
    }
    public void fillTel(String phone){
        WebElement ph = webDriver.findElement(By.id("tel"));
        ph.sendKeys(phone);
    }

    public void fillCity(String city){
        WebElement ct = webDriver.findElement(By.id("city"));
        ct.sendKeys(city);
    }
    public void fillEmail(String email){
        WebElement em = webDriver.findElement(By.id("mail"));
        em.sendKeys(email);
    }
    public void fillPass(String password){
        WebElement ps = webDriver.findElement(By.id("pass"));
        ps.sendKeys(password);
    }
    public void pressNext(){
        WebElement bt = webDriver.findElement(By.cssSelector("#entrepreneur-register-form > div.ng-scope > div > div:nth-child(3) > form > div.form-controls > button"));
        bt.click();
    }
    public void checkUrl(){
        Assert.assertTrue(webDriver.getCurrentUrl().contains("https://dev.equerest.com/register#/entrepreneur"));
    }

}
