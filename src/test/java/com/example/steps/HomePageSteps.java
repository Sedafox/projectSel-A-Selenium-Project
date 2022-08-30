package com.example.steps;

import com.example.Pages.HomePage;
import com.example.state.ScenarioState;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Terminal steps that verify error conditions. The currently active example/scenario state is injected into an instance
 * of this class per example/scenario, thus you can share state across classes/steps.
 */
public class HomePageSteps {

  private final ScenarioState state;
  private final WebDriver driver;

  private final HomePage homePage;

  public HomePageSteps(final ScenarioState state) {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
    WebDriver driver=new ChromeDriver();
    this.driver = driver;

    HomePage homePage = new HomePage(driver);
    this.homePage = homePage;
    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    this.state = state;
  }
  @Given("User visits saucedemo.com")
  public void userVisitsSaucedemoCom() {
    homePage.goToHome();
    assertEquals(homePage.basePage(), driver.getCurrentUrl()); //URL should be basePage, defined in Base.java
  }

  @And("User logs in")
  public void userLogsIn() {
    homePage.logIn();
  }

  @Then("user is taken to inventory page")
  public void userIsTakenToInventoryPage() {
    assertEquals(homePage.basePage() + "inventory.html", driver.getCurrentUrl());
    driver.close();
  }
}
