package com.example.steps;

import com.example.Hook;
import com.example.Pages.InventoryPage;
import com.example.state.ScenarioState;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryPageSteps {

    private final ScenarioState state;
    private WebDriver driver = Hook.WebDriverUtils.getDriver();

    private InventoryPage inventoryPage;

    public InventoryPageSteps(final ScenarioState state) {
        this.state = state;
        this.inventoryPage = new InventoryPage();
    }

    @When("user clicks ADD TO CART button on a product")
    public void userClicksADDTOCARTButtonOnAProduct() {
        inventoryPage.backPackAddToCart().click();
    }

    @Then("cart displays one item inside of it")
    public void cartDisplaysOneItemInsideOfIt() {
        assertEquals("1", inventoryPage.shoppingCartBadge().getText());
    }
}
