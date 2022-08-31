@Smoke @InventoryPage
Feature: Tests the Inventory page


  Scenario: User Adds Product To Cart, Cart shows a one next to it
    Given User visits saucedemo.com
    And User logs in
    When user clicks ADD TO CART button on a product
    Then cart displays one item inside of it

  Scenario: User verifies facebook, twitter, and linked in links exist at the bottom of the page
    Given User visits saucedemo.com
    And User logs in
    Then user verifies facebook, twitter, and linked in links exist at the bottom of the page