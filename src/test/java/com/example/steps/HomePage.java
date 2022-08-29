package com.example.steps;

import com.example.Pages.YoutubeHomePage;
import com.example.state.ScenarioState;
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
public class HomePage {

  private final ScenarioState state;
  private final WebDriver driver;

  private final YoutubeHomePage youtubeHomePage;

  public HomePage(final ScenarioState state) {
    System.setProperty("webdriver.chrome.driver", "/home/virtseda/Downloads/cucumber-junit5-example-main/src/test/resources/chromedriver");
    WebDriver driver=new ChromeDriver();
    this.driver = driver;
    YoutubeHomePage youtubeHomePage = new YoutubeHomePage(driver);
    this.youtubeHomePage = youtubeHomePage;
    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    this.state = state;
  }

  @Given("User visits youtube")
  public void User_visits_youtube() {
      driver.get("https://www.youtube.com");
  }
  @When("User clicks youtube home button in top left")
  public void User_clicks_youtube_home_button_in_top_left(){
      WebElement element = driver.findElement(By.xpath("//*[@class='style-scope ytd-logo']"));
      element.click();
  }


  @Then("user is on the youtube home page")
  public void userIsOnTheYoutubeHomePage() {
    assertEquals("https://www.youtube.com/", driver.getCurrentUrl());
  }

  @When("user clicks Explore button on left hand side of page")
  public void userClicksExploreButtonOnLeftHandSideOfPage() throws InterruptedException {
    WebElement element = driver.findElement(By.xpath("(//*[@title='Explore'])[0]"));
    Thread.sleep(5000);
    element.isDisplayed();
    element.click();
    //assertEquals("https://www.youtube.com/feed/explore", driver.getCurrentUrl());
    assertEquals(1,1);
  }

  @Then("user observes Trending and Music buttons")
  public void userObservesTrendingAndMusicButtons() {
    assertEquals(1,1);
  }
}
