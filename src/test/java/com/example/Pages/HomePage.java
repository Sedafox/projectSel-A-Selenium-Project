package com.example.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHome(){
        driver.get(basePage());
    }

    public void logIn(){
        String standardUser = "standard_user";
        String password = "secret_sauce";
        userName(driver).sendKeys(standardUser);
        passWord(driver).sendKeys(password);
        loginButton(driver).click();
    }
}
