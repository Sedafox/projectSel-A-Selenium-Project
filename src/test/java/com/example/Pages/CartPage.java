package com.example.Pages;

import com.example.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends Base {

    private WebDriver driver = Hook.WebDriverUtils.getDriver();

    public WebElement continueShoppingButton() { return driver.findElement(By.id("continue-shopping")); }


}
