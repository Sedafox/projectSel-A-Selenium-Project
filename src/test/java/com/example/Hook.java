package com.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void initalizeDriver() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriverUtils.setDriver(new ChromeDriver());
    }

    public class WebDriverUtils {
        private static WebDriver driver;
        public static void setDriver(WebDriver webDriver) {
            if (driver == null) {
                driver = webDriver;
            }
        }
        public static WebDriver getDriver() {
            if (driver == null) {
                throw new AssertionError("Driver is null. Initialize driver before calling this method.");
            }
            return driver;
        }
    }

}
