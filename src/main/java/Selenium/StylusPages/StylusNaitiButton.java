package Selenium.StylusPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StylusNaitiButton {
    private WebElement naitiButton;

    public StylusNaitiButton(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;
    By nitiButtonLocator = By.xpath("//*[@id=\"head-search\"]/form/input[2]");

    public void setNaitiButton(){
        naitiButton = webDriver.findElement(nitiButtonLocator);
        naitiButton.click();
    }
}
