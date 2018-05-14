package Selenium.Home.StylusPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vitaliy on 14.05.2018.
 */
public class StylusVerify {
    private WebElement content;
    private WebDriver webDriver;

    By searchText = By.xpath("//*[@id=\"search-list\"]/ul/li[2]/a/span");


    public WebElement getcontent(){
        content = webDriver.findElement(searchText);
        return content;
    }
}
