package Selenium.pages;

import Selenium.core.WebDriverTestBase;
import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vitaliy on 10.05.2018.
 */
public class GoogleSearchPage extends AbstractPages{

//    By searchLocator = By.xpath("//*[@id='lst-ib']");
    By searchLocator = By.xpath("//*[@id=\"lst-ib\"]"); //wrong Xpath for ScreenShots
    private WebElement searchField;



    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);

       }
@Step("Ввод текста в поле поиска")
    public void search(String searchText) {
        searchField = wait.until(ExpectedConditions.elementToBeClickable(searchLocator));
        searchField.sendKeys(searchText);
        searchField.submit();
    }

}
