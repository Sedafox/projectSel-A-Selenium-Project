package com.example.steps;

import com.example.state.ScenarioState;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Terminal steps that verify error conditions. The currently active example/scenario state is injected into an instance
 * of this class per example/scenario, thus you can share state across classes/steps.
 */
public class HomePage {

  private final ScenarioState state;
  private final WebDriver driver;

  public HomePage(final ScenarioState state) {
    System.setProperty("webdriver.chrome.driver", "/home/virtseda/Downloads/cucumber-junit5-example-main/src/test/resources/chromedriver");
    WebDriver driver=new ChromeDriver();
    this.driver = driver;
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    this.state = state;
  }

  @Given("User visits youtube")
  public void User_visits_youtube() {
    if(1 == 1){
      driver.get("https://www.youtube.com");
    }
  }
  @When("User clicks youtube home button in top left")
  public void User_clicks_youtube_home_button_in_top_left(){
    if(1 == 1){
      assertEquals(2, 2);
    }
  }


  @Then("user is on the youtube home page")
  public void userIsOnTheYoutubeHomePage() {
    assertEquals(3, 3);
  }
}
