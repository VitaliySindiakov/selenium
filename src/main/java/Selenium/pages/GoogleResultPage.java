package Selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.*;

/**
 * Created by Vitaliy on 10.05.2018.
 */
public class GoogleResultPage extends AbstractPages{

    By linkLocator = By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/h3/a");

    public GoogleResultPage(WebDriver webDriver) {
        super(webDriver);
      }

      @Step("Получение линки")
    public WebElement getLink(){
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(linkLocator));
        return link;
    }
}
