package com.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {


    public static WebDriver driver;

    @Before
    public void beforeEach(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        this.driver = driver;


        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void afterEach(){
        this.driver.close();
    }

}
