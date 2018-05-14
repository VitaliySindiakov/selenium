package Selenium.Home.GooglePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMailNextButton {
    private WebElement nextButton;

    public GoogleMailNextButton(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;

    By nextButtonLocator = By.xpath("<div class=\"ANuIbb IdAqtf\" jsname=\"k4HEge\" tabindex=\"0\"></div>");

    public void clickNextButton(){
        nextButton = webDriver.findElement(nextButtonLocator);
        nextButton.isDisplayed();
        nextButton.click();
    }

}
