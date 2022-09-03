package com.example.steps;

import com.example.Hook;
import com.example.Pages.CartPage;
import com.example.Pages.InventoryPage;
import com.example.state.ScenarioState;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartPageSteps {

    private final ScenarioState state;
    private WebDriver driver = Hook.WebDriverUtils.getDriver();

    private InventoryPage inventoryPage;
    private CartPage cartPage;

    private String chosenProduct;

    public CartPageSteps(final ScenarioState state) {
        this.state = state;
        this.inventoryPage = new InventoryPage();
        this.cartPage = new CartPage();
    }

    @When("user clicks ADD TO CART button on a random product")
    public void userClicksADDTOCARTButtonOnARandomProduct() {
        int chosenNumber = cartPage.getRandomNumber(1, 6);
        switch(chosenNumber) {
            case 1:
                inventoryPage.backPackAddToCart().click();
                chosenProduct = "Backpack";
                break;
            case 2:
                inventoryPage.bikeLightAddToCart().click();
                chosenProduct = "Bike Light";
                //Sauce Labs Bike Light
                break;
            case 3:
                inventoryPage.boldTShirtAddToCart().click();
                chosenProduct = "Bolt T-Shirt";
                //Sauce Labs Bolt T-Shirt
                break;
            case 4:
                inventoryPage.fleeceJacketAddToCart().click();
                chosenProduct = "Fleece Jacket";
                //Sauce Labs Fleece Jacket
                break;
            case 5:
                inventoryPage.onsesieAddToCart().click();
                chosenProduct = "Onesie";
                //Sauce Labs Onesie
                break;
            case 6:
                inventoryPage.tShirtAddToCart().click();
                chosenProduct = "T-Shirt";
                //Test.allTheThings() T-Shirt (Red)
                break;
        }
    }

    @Then("User verifies that same item is on the cart page")
    public void userVerifiesThatSameItemIsOnTheCartPage() {
        driver.findElement(By.xpath("//*[contains(text(),'" + chosenProduct + "')]"));
    }

    @And("clicks the cart button to visit the cart page")
    public void clicksTheCartButtonToVisitTheCartPage() {
        inventoryPage.shoppingCartButton().click();
    }

    @Then("user verifies that continue shopping button exists")
    public void userVerifiesThatContinueShoppingButtonExists() {
        cartPage.continueShoppingButton();
    }

    @And("clicking it returns the user back to the inventory page")
    public void clickingItReturnsTheUserBackToTheInventoryPage() {
        cartPage.continueShoppingButton().click();
        assertEquals(cartPage.basePage() + "inventory.html", driver.getCurrentUrl());
    }
}