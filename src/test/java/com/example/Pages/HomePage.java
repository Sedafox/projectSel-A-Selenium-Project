package com.example.Pages;

import com.example.Hook;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    private WebDriver driver = Hook.WebDriverUtils.getDriver();

    public void goToHome(){
        driver.get(basePage());
    }

    public void logIn() {
        String standardUser = "standard_user";
        String password = "secret_sauce";
        userName(driver).sendKeys(standardUser);
        passWord(driver).sendKeys(password);
        loginButton(driver).click();
    }
}
