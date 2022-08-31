package com.example.Pages;

import com.example.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage extends Base {

    private WebDriver driver = Hook.WebDriverUtils.getDriver();

    public InventoryPage() {
        this.driver = driver;
    }

    public WebElement shoppingCartBadge(){
        return driver.findElement(By.className("shopping_cart_badge"));
    }

    public WebElement backPackAddToCart(){
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
}
