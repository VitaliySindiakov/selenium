package com.equerest.Bdd;

import com.equerest.pages.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vitaliy on 07.06.2018.
 */
public class EnterpreneurSteps {

    public static final String REGISTER_PAGE = "https://dev.equerest.com/register#/entrepreneur";

    private WebDriver webDriver;
    private RegisterPage registerPage;

    @Given("^I am on new project registration page")
    public void openRegisterPage() {
        ChromeDriverManager.getInstance().setup();
        webDriver = new ChromeDriver();
        webDriver.get(REGISTER_PAGE);
    }

    @When("^enter my name \"([^\"]*)\" and My last name \"([^\"]*)\"")
    public void fillFirstAndLastName(String firstName, String lastName){
        registerPage = new RegisterPage(webDriver);
        registerPage.fillFIO(firstName, lastName);
    }

    @When("^text my phone \"([^\"]*)\"")
    public void fillPhone(String phone){
        registerPage = new RegisterPage(webDriver);
        registerPage.fillTel(phone);
    }
    @When("^i enter my city \"([^\"]*)\"")
    public void fillCity(String city){
        registerPage = new RegisterPage(webDriver);
        registerPage.fillCity(city);
    }
    @When("^i enter my email \"([^\"]*)\"")
    public void fillEmail(String email){
        registerPage = new RegisterPage(webDriver);
        registerPage.fillEmail(email);
    }
    @When("^i enter my password \"([^\"]*)\"")
    public void fillPassword(String password){
        registerPage = new RegisterPage(webDriver);
        registerPage.fillPass(password);
    }
    @When("^i press next")
    public void pressNext(){
        registerPage = new RegisterPage(webDriver);
        registerPage.pressNext();
    }
    @Then("^I check where am i")
    public void urlToCheck(){
        registerPage = new RegisterPage(webDriver);
        registerPage.checkUrl();
    }
}
