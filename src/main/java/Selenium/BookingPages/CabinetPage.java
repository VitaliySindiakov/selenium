package Selenium.BookingPages;


import Selenium.core.WebDriverTestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class CabinetPage extends WebDriverTestBase {
    WebElement javaScript;

    private WebDriverWait wait;
    private WebElement registerFrame;
    By Locator = By.cssSelector("#ftsAutocomplete, .ui-autocomplete-input");

    By clickCabinetLocator = By.cssSelector("#current_account > a");
    By clickMyPrivateCabinet = By.cssSelector("div.profile-menu__item.profile_menu__item--mydashboard");
    By registerFieldLocator = By.cssSelector("#frm");

    WebElement startPoint;
    By startPoinLocator = By.cssSelector("#ss");

    WebElement takePoint;
    By takePointLocator = By.cssSelector("[data-label=\"Kiev, Ukraine\"]");

    WebElement startData;
    By startDataLocator = By.cssSelector("[data-mode=\"checkin\"]");
    WebElement startDataChose;
    By startDataChoseLocator = By.cssSelector("[data-id=\"1533081600000\"]");

    WebElement endData;
    By endDataLocator = By.cssSelector("[data-mode=\"checkout\"]");
    WebElement endDataChose;
    By endDataChoseLocator = By.cssSelector("[data-id=\"1533254400000\"]");

    WebElement childrencount;
    By childrenLocator = By.cssSelector("[name=\"group_children\"]");
    WebElement childrencountChose;
    By childrenChoseLocator = By.cssSelector("[name=\"group_children\"] [value=\"4\"]");
    WebElement registerField;

    WebElement searchButton;
    By searchButtonLocator = By.cssSelector("div.sb-searchbox-submit-col.-submit-button  [type=\"submit\"]");


    WebElement link;
    By linkLocator = By.cssSelector(" [id=\"hotellist_inner\"]");


    public CabinetPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(this.webDriver, 10);
    }

    @Step("Войти в личный кабинет")
    public void goToCabinet() {

        webDriver.navigate().refresh();
        WebElement cabinet = webDriver.findElement(clickCabinetLocator);
        cabinet.click();
        wait.until(ExpectedConditions.elementToBeClickable(clickMyPrivateCabinet));
        javaScript = (WebElement) ((JavascriptExecutor) webDriver)
                .executeScript("document.querySelector(\"#b2indexPage > div.fly-dropdown.fly-dropdown--profile-menu.fly-dropdown_bottom.fly-dropdown_arrow-right > div > div.profile-menu__item.profile_menu__item--mydashboard > a\").click()");


    }

    @Step("Ищем фрейм")
    public void registrartion() {

        registerFrame = webDriver.findElement(registerFieldLocator);
        registerFrame.click();


    }

    @Step("Точка отправления")
    public void setStartPoint(String cityStart) {
        startPoint = webDriver.findElement(startPoinLocator);
        startPoint.click();
        startPoint.sendKeys(cityStart);

        takePoint = webDriver.findElement(takePointLocator);
        takePoint.click();
    }

    @Step("Дата начала")
    public void firstData() {
        startData = webDriver.findElement(startDataLocator);
        startData.click();
        startDataChose = webDriver.findElement(startDataChoseLocator);
        startDataChose.click();
    }

    @Step("Дата конца")
    public void secondData() {
        endData = webDriver.findElement(endDataLocator);
        wait.until(ExpectedConditions.elementToBeClickable(endData));
        endData.click();
        endDataChose = webDriver.findElement(endDataChoseLocator);
        List <WebElement> list =webDriver.findElements(endDataChoseLocator);
        list.get(1).click();

    }

    @Step("Количество детей")
    public void childrenChange() {
        childrencount = webDriver.findElement(childrenLocator);
        wait.until(ExpectedConditions.elementToBeClickable(childrencount));
        childrencount.click();
        childrencountChose = webDriver.findElement(childrenChoseLocator);
        wait.until(ExpectedConditions.elementToBeClickable(childrencountChose));
        childrencountChose.click();

        WebElement age = webDriver.findElement(By.cssSelector(" [name=\"age\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(age));
        age.click();
        WebElement ageChose = webDriver.findElement(By.cssSelector(" [name=\"age\"] [value=\"15\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(ageChose));
        ageChose.click();
    }

    @Step("Кнопка - Поиск")
    public void submitButton() {
        searchButton = webDriver.findElement(searchButtonLocator);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    public WebElement getLink(){
        link = webDriver.findElement(linkLocator);
        return link;
    }

}
