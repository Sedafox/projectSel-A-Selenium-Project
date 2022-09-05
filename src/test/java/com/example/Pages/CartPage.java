package com.example.Pages;

import com.example.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends Base {

    private WebDriver driver = Hook.WebDriverUtils.getDriver();

    public WebElement continueShoppingButton() { return driver.findElement(By.id("continue-shopping")); }

    public WebElement checkoutButton() { return driver.findElement(By.id("checkout")); }

    public WebElement firstNameField() { return driver.findElement(By.id("first-name")); }

    public WebElement lastNameField() { return driver.findElement(By.id("last-name")); }

    public WebElement zipCodeField() { return driver.findElement(By.id("postal-code")); }

    public WebElement continueButton() { return driver.findElement(By.id("continue")); }


}
