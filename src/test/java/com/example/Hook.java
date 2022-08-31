package com.example;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    @Before
    public static void initalizeDriver() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            WebDriverUtils.setDriver(new ChromeDriver());
    }

    @After
    public void closeDriver(){
        WebDriverUtils.getDriver().quit();

    }

    public class WebDriverUtils {
        private static WebDriver driver;
        private int numberOfDrivers;
        public static void setDriver(WebDriver webDriver) {
                driver = webDriver;
        }

        public static WebDriver getDriver() {
            if (driver == null) {
                throw new AssertionError("Driver is null. Initialize driver before calling this method.");
            }
            return driver;
        }
    }

}
