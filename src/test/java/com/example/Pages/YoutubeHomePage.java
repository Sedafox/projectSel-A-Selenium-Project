package com.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YoutubeHomePage {

    private final WebDriver driver;

    public YoutubeHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement exploreButton(){

        return driver.findElement(By.xpath("//*[@class='style-scope ytd-guide-entry-renderer']"));
    }
}
