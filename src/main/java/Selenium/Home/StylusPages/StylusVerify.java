package Selenium.Home.StylusPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vitaliy on 14.05.2018.
 */
public class StylusVerify {
    private WebElement content;

    public StylusVerify(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;

    By searchText = By.xpath("//*[@id='search-list']/ul/li[@class=\"item out-of-production\"]/a[@data-name=\"Sony Xperia Z2 Black\"]");


    public WebElement getLink(){
        WebElement link = webDriver.findElement(searchText);
        return link;
    }
}
