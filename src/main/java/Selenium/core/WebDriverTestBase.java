package Selenium.core;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
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

    private DesiredCapabilities setDesiredCapabilities(String platform, String remoteBrowser) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        if (platform.equalsIgnoreCase(Platform.WIN10.name())) {
            caps.setPlatform(Platform.WIN10);
            caps.setBrowserName(remoteBrowser);
        }
        return caps;
    }
    @Parameters({"platform", "remoteBrowser"})
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

//            case "remote":
//                DesiredCapabilities caps = setDesireCapabilities(platdorm, remoteBrowser);
//                WebDriver = new RemoteWebDriver(new URL(""),caps);
//                break;
        }
    }
    @AfterClass
    public void tearDown() {
        webDriver.quit();


    }

}






