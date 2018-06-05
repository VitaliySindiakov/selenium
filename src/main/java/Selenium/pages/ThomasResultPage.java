package Selenium.pages;

import Selenium.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Vitaliy on 05.06.2018.
 */
public class ThomasResultPage extends AbstractPages{
    By linklocator =By.cssSelector("#content-container > search-results-page > div:nth-child(4) > div > package-list > div > div:nth-child(1) > package-card > article > main > div > package-card-details > div > ul > li:nth-child(2) > div");


    public ThomasResultPage(WebDriver webDriver) {
        super(webDriver);
    }
    public WebElement getLink(){
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(linklocator));
        return link;
    }
}
