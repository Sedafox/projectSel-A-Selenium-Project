package com.example;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hook {

    @Before
    public void initalizeDriver() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriverUtils.setDriver(new ChromeDriver());
    }

    @After
    public void closeDriver(){
        WebDriverUtils.getDriver().close();
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
