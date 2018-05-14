package Selenium.Home.GooglePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePassNextButton {
    private WebElement nextButtonPass;

    public GooglePassNextButton(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;

    By nextButtonLocator = By.xpath("//*[@class=\"RveJvd snByac\"]");

    public void passButton(){
        nextButtonPass = webDriver.findElement(nextButtonLocator);
        nextButtonPass.click();
    }
}
