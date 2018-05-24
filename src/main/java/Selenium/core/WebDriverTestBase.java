package Selenium.core;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.*;

/**
 * Created by Vitaliy on 10.05.2018.
 */
@Listeners(Selenium.core.TestListener.class)
public class WebDriverTestBase {
    private String browser = System.getProperty("browser", CHROME);
    private long implicitWait = Long.parseLong(PropertiesCache.getProperty("wait.implicit"));
    private long pageWait = Long.parseLong(PropertiesCache.getProperty("wait.page"));
    private long scriptWait = Long.parseLong(PropertiesCache.getProperty("wait.script"));

    protected WebDriver webDriver;

    @BeforeClass
    public void setup() {

        switch (browser.toLowerCase()) {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
                webDriver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
                webDriver.manage().timeouts().setScriptTimeout(scriptWait, TimeUnit.SECONDS);
                break;

            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                webDriver = new FirefoxDriver();
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
                webDriver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
                webDriver.manage().timeouts().setScriptTimeout(scriptWait, TimeUnit.SECONDS);
                break;

            case EDGE:
                EdgeDriverManager.getInstance().setup();
                webDriver = new EdgeDriver();
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
                webDriver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
                webDriver.manage().timeouts().setScriptTimeout(scriptWait, TimeUnit.SECONDS);
                break;
        }
    }
    @AfterClass
    public void tearDown() {


    }

}






