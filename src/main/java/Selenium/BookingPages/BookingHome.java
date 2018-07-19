package Selenium.BookingPages;

import Selenium.core.WebDriverTestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BookingHome extends WebDriverTestBase {
    WebDriverWait wait;
    WebElement javaScript;

    public BookingHome(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(this.webDriver, 25);
    }

    private WebDriver webDriver;

    private WebElement searchfield;
    By searchfieldlocator = By.xpath("//*[@id=\"ss\"]");

    private WebElement clickToOpenDateFrom;
    By getClickToOpenDateFromLocator = By.cssSelector("div[data-calendar2-title*=Check-in]");

    WebElement moveNextButton;
    By getMoveNextButtonLocator = By.cssSelector("div.xp__dates-inner.xp__dates__checkin div.c2-button.c2-button-further span.c2-button-inner");

    WebElement firstDate;
    By getFirstDateLocator = By.xpath("//*[@data-id='1535760000000']");

    private WebElement clickToOpenDataTo;
    By getClickToOpenDateToLocator = By.cssSelector("div[data-calendar2-title*=Check-out]");

    private WebElement secondDate;
    By getsecondDateLocator = By.cssSelector("#frm  div.xp__fieldset.accommodation  div.xp__dates.xp__group > div > div:nth-child(3) [data-id=\"1538265600000\"]");

    private WebElement searchButton;
    By getsearchButtonLocator = By.cssSelector(".sb-searchbox__button");

    private WebElement loginHideButton;
    By getLoginHideButtonLocator = By.cssSelector("#current_account");

    private WebElement getMailField;
    By getMailfieldlocator = By.cssSelector("[name=username]");

    private WebElement getPassField;
    By getPassFieldLocator = By.cssSelector("[name=password]");

    private WebElement CarButton;
    By getCarButtonLocator = By.cssSelector("#cross-product-bar > div > a:nth-child(4)");


    @Step("Ввод поиска города")
    public void setSearchfield(String city) {
        searchfield = webDriver.findElement(searchfieldlocator);
        searchfield.sendKeys(city);
    }

    @Step("Выбор даты начала")
    public void firstDateSelect() {

        wait.until(ExpectedConditions.elementToBeClickable(getClickToOpenDateFromLocator));
        clickToOpenDateFrom = webDriver.findElement(getClickToOpenDateFromLocator);
        clickToOpenDateFrom.click();
        moveNextButton = webDriver.findElement(getMoveNextButtonLocator);
        moveNextButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(getFirstDateLocator));
        firstDate = webDriver.findElement(getFirstDateLocator);
        firstDate.click();
    }

    @Step("Выбор даты - окончания")
    public void secondDateSelect() {
        clickToOpenDataTo = webDriver.findElement(getClickToOpenDateToLocator);
        clickToOpenDataTo.click();

        secondDate = webDriver.findElement(getsecondDateLocator);
        wait.until(ExpectedConditions.elementToBeClickable(secondDate));
        secondDate.click();
    }

    @Step("кнопка поиска")
    public void searchButton() {
        searchButton = webDriver.findElement(getsearchButtonLocator);
        searchButton.click();

    }

    @Step("кнопка входа в кабинет")
    public void clickloginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(getLoginHideButtonLocator));
        loginHideButton = webDriver.findElement(getLoginHideButtonLocator);
        loginHideButton.click();
        javaScript = (WebElement) ((JavascriptExecutor) webDriver)
                .executeScript("document.querySelector(\"#b_tt_holder_1 > div\").click()");
    }

    @Step("поле ввода имени")
    public void mailField(String mail) {
        wait.until(ExpectedConditions.elementToBeClickable(getMailfieldlocator));
        getMailField = webDriver.findElement(getMailfieldlocator);
        getMailField.click();
        getMailField.sendKeys(mail);
    }

    @Step("поле ввода пароля")
    public void passField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(getMailfieldlocator));
        getPassField = webDriver.findElement(getPassFieldLocator);
        getPassField.click();
        getPassField.sendKeys(password);
        getPassField.sendKeys(Keys.ENTER);
    }

    public WebElement getLink() {
        WebElement userName = webDriver.findElement(By.cssSelector("#current_account > a > span.user_name_block > span.header_name.user_firstname.ge-no-yellow-bg"));
        return userName;
    }



    @Step("Выбор языка")
    public void changeLanguage() {
        WebElement lang = webDriver.findElement(By.cssSelector("#user_form > ul > li.user_center_option.uc_language.js-uc-language"));
        lang.click();

        WebElement langEng = webDriver.findElement(By.cssSelector("#current_language_foldout > div:nth-child(1) > div > ul:nth-child(2) > li.lang_en-gb > a"));
        langEng.click();
    }


}
