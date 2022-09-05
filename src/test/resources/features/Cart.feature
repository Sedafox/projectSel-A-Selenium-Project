@Cart
Feature: User tests everything to do with the cart page

  Scenario: User adds a random item to the cart, then ensures the same item appears on the cart page
    Given User visits saucedemo.com
    And User logs in
    When user clicks ADD TO CART button on a random product
    And clicks the cart button to visit the cart page
    Then User verifies that same item is on the cart page

    Scenario: User verifies Continue Shopping button exists on the cart screen
      Given User visits saucedemo.com
      And User logs in
      When clicks the cart button to visit the cart page
      Then user verifies that continue shopping button exists
      And clicking it returns the user back to the inventory page

    Scenario: User verifies checkout button is functional
      Given User visits saucedemo.com
      And User logs in
      When clicks the cart button to visit the cart page
      Then user clicks the checkout button
      And User verifies they are taken to the checkout step one page

    Scenario: User verifies that entering information on checkout step one page will bring user to checkout step 2
      Given User visits saucedemo.com
      And User logs in
      When clicks the cart button to visit the cart page
      And user clicks the checkout button
      When user enters name and zip info
      And clicks Continue
      Then user is on checkout step 2 page