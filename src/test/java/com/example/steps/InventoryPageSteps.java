package com.example.steps;

import com.example.Hook;
import com.example.Pages.HomePage;
import com.example.Pages.InventoryPage;
import com.example.state.ScenarioState;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPageSteps {

    private final ScenarioState state;
    private WebDriver driver = Hook.WebDriverUtils.getDriver();

    private InventoryPage inventoryPage;

    public InventoryPageSteps(final ScenarioState state) {
        this.state = state;
        this.inventoryPage = new InventoryPage(driver);
    }

    @When("user clicks ADD TO CART button on a product")
    public void userClicksADDTOCARTButtonOnAProduct() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
}
