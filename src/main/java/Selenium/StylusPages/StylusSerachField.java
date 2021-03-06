package Selenium.StylusPages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StylusSerachField {

    public StylusSerachField(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;
    private WebElement searchfield;
    By inputLocator = By.xpath("//*[@id=\"head-search\"]/form/input[1]");
@Step("Ввод поиска")
    public void inputTextField(String searchresult){
        searchfield = webDriver.findElement(inputLocator);
        searchfield.sendKeys(searchresult);
    }
}
