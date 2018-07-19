package Selenium.BookingPages;

import Selenium.pages.AbstractPages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BookingResultPage extends AbstractPages {
    WebElement link;

    private By linkLocator = By.cssSelector("#hotellist_inner");

    public BookingResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Получение линки")
    public WebElement getLink() {
        link = webDriver.findElement(linkLocator);
        return link;
    }


}

