@InventoryPage
Feature: Tests the Inventory page


  Scenario: User Adds Product To Cart, Cart shows a one next to it
    Given User visits saucedemo.com
    And User logs in
    When user clicks ADD TO CART button on a product
    #Then cart displays one item inside of it