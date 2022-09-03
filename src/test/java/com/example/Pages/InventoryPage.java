package com.example.Pages;

import com.example.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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

    public WebElement twitterButton() { return driver.findElement(By.xpath("//*[@href='https://twitter.com/saucelabs']")); }

    public WebElement facebookButton() { return driver.findElement(By.xpath("//*[@href='https://www.facebook.com/saucelabs']")); }

    public WebElement linkedInButton() { return driver.findElement(By.xpath("//*[@href='https://www.linkedin.com/company/sauce-labs/']")); }

    public WebElement filterDropDown() { return driver.findElement(By.className("product_sort_container")); }

    public Select filterDropDownOptions() {
        Select oSel = new Select(filterDropDown());
        return oSel;
    }

    public WebElement hamburgerMenu() { return driver.findElement(By.id("react-burger-menu-btn")); }

    public WebElement hamburgerAllItems() { return driver.findElement(By.id("inventory_sidebar_link")); }

    public WebElement hamburgerAbout() { return driver.findElement(By.id("about_sidebar_link")); }

    public WebElement hamburgerLogOut() { return driver.findElement(By.id("logout_sidebar_link")); }

    public WebElement hamburgerReset() { return driver.findElement(By.id("reset_sidebar_link")); }

    public List<WebElement> defaultProducts() { return driver.findElements(By.className("inventory_item_description")); }
}
