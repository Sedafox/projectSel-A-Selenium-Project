@Cart
Feature: User tests everything to do with the cart page

  Scenario: User adds a random item to the cart, then ensures the same item appears on the cart page
    Given User visits saucedemo.com
    And User logs in
    When user clicks ADD TO CART button on a random product
    And clicks the cart button to visit the cart page
    Then User verifies that same item is on the cart page