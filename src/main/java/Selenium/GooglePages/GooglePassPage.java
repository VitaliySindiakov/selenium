package Selenium.GooglePages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePassPage {
    public GooglePassPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;
    private WebElement passField;

    By passFieldLocator = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
@Step("Ввод пароля")
    public void inputField(String password){
        passField = webDriver.findElement(passFieldLocator);
        passField.sendKeys(password);
        passField.submit();
    }

}
