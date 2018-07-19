package Selenium.GooglePages;

import Selenium.core.WebDriverTestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GooglePassNextButton extends WebDriverTestBase{
    WebDriverWait wait;

    public GooglePassNextButton(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(this.webDriver, 25);
    }

    private WebElement nextButtonPass;
    private WebDriver webDriver;


    By nextButtonLocator = By.cssSelector("#passwordNext");



    @Step("Кнопка далее - пароль")
    public void passButton(){
        nextButtonPass = webDriver.findElement(nextButtonLocator);
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonPass));

        nextButtonPass.click();

    }
}
