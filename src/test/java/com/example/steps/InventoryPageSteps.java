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

    @Then("user verifies facebook, twitter, and linked in links exist at the bottom of the page")
    public void userVerifiesFacebookTwitterAndLinkedInLinksExistAtTheBottomOfThePage() {
        inventoryPage.twitterButton();
        inventoryPage.facebookButton();
        inventoryPage.linkedInButton();
    }

    @Then("user verifies filter drop down contains Name \\(A-Z), Name \\(Z-A), Price \\(Low-High), and Price \\(High-Low)")
    public void userVerifiesFilterDropDownContainsNameAZNameZAPriceLowHighAndPriceHighLow(){
        inventoryPage.filterDropDownOptions().selectByVisibleText("Name (A to Z)");
        inventoryPage.filterDropDownOptions().selectByVisibleText("Name (Z to A)");
        inventoryPage.filterDropDownOptions().selectByVisibleText("Price (low to high)");
        inventoryPage.filterDropDownOptions().selectByVisibleText("Price (high to low)");
    }
}
