package Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Vitaliy on 15.05.2018.
 */
public abstract class AbstractPages  {



    public AbstractPages(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(this.webDriver, 25);
    }

    public WebDriverWait wait;
    public WebDriver webDriver;
}
