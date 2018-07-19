package Selenium.GooglePages;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMailEnter {
    public GoogleMailEnter(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;
    WebElement signUp;

    By gmailButton = By.xpath("//*[@id=\"identifierId\"]");
@Step("Ввод имени")
    public void signUpButton(String name){
        signUp = webDriver.findElement(gmailButton);
        signUp.sendKeys(name);


    }
      }


