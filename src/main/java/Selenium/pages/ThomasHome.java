package Selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ThomasHome extends AbstractPages {


    WebElement flyFrom;
    WebElement whereTo;
    WebElement flyFromText;
    WebElement flylist;
    WebElement liverpool;
    WebElement whereToField;
    WebElement whereToField2;
    WebElement spam;
    WebElement list;


    By searchFromField = By.cssSelector("#SearchbarForm-origin");
    By serchFrame = By.cssSelector("#SearchbarForm-originContainer tc-typeahead   div.SearchbarForm-summary.ng-binding");
    By searchFrameWhereTo = By.cssSelector("#SearchbarForm-destinationContainer > div > div > div > tc-typeahead > div > div.SearchbarForm-summary.ng-binding");
    By justclicktoOpen = By.cssSelector("#SearchbarForm-destinationContainer > div > div > div > tc-typeahead > div > div.SearchbarForm-summary.ng-binding");
    By searchLiverpool = By.cssSelector("#PopularTooltip--airports > div:nth-child(2) > div > div:nth-child(3) > div:nth-child(2) > label");
    By searchList = By.cssSelector("#SearchbarForm-originContainer > div > div > div > button > i");
    By searchField2locator = By.xpath("//*[@id=\"SearchbarForm-originContainer\"]/div/div/div/tc-typeahead/div/div[2]");
    By whereToFieldLocator = By.cssSelector("#SearchbarForm-goingTo");
    By whereToFieldLocator2 = By.cssSelector("#SearchbarForm-destinationContainer > div > div > div > tc-typeahead > div > div.SearchbarForm-summary.ng-binding");
    By spamLOcator = By.cssSelector(".e108742-close.e108742-close-on-click");
    private String serchFrom = "Liverpool";
    private String searchWhere = "Turkey";


    public ThomasHome(WebDriver webDriver) {
        super(webDriver);
    }
@Step("Нажатие на фрейм")
    public void clickTextFrom() {
        spam = webDriver.findElement(spamLOcator);
        spam.click();
        webDriver.navigate().refresh();
        flyFromText = wait.until(ExpectedConditions.elementToBeClickable(serchFrame));
        flyFromText.click();
    }

    @Step("Нажатие на поле ввода")
    public void chooseAirport() {
        flylist = webDriver.findElement(searchList);
        flylist.click();
    }
    @Step("Ввод поиска текста - откуда ")
    public void searchDistationsFrom() {
        flyFrom = webDriver.findElement(searchFromField);
        flyFrom.click();
        flyFrom.sendKeys(serchFrom);
        flyFrom.sendKeys(Keys.ENTER );
    }
    @Step("Клик на введенный текст откуда")
    public void clickAfterText(){
        WebElement clickText = webDriver.findElement(By.xpath("//*[@id=\"SearchbarForm-originContainer\"]/div/div/div/tc-typeahead/div/div[2]"));
        clickText.click();
    }

    public void setSearchFrameWhereTo() {
        whereTo = webDriver.findElement(searchFrameWhereTo);
        whereTo.click();
        whereToField = webDriver.findElement(whereToFieldLocator);
        whereToField.sendKeys(searchWhere);
//        whereToField.sendKeys(Keys.ARROW_DOWN);
//        whereToField2 = webDriver.findElement(whereToFieldLocator2);
//        whereToField2.click();
    }
    @Step("Нажатие на кнопку поиска")
    public void clickSearchButton(){
        WebElement searchButton = webDriver.findElement(By.cssSelector("#SearchbarForm-submitBtn"));
        searchButton.click();
    }
}
