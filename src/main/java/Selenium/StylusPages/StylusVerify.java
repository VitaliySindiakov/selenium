package Selenium.StylusPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vitaliy on 14.05.2018.
 */
public class StylusVerify {
    public StylusVerify(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;

    By searchText = By.cssSelector(".product-grid");


    public WebElement getLink(){
        WebElement link = webDriver.findElement(searchText);
        return link;
    }
}
