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

  Scenario: User verifies filter drop down contains: Name (A-Z), Name (Z-A), Price (Low-High), Price (High-Low)
    Given User visits saucedemo.com
    And User logs in
    Then user verifies filter drop down contains Name (A-Z), Name (Z-A), Price (Low-High), and Price (High-Low)

  Scenario: User verifies that clicking the hamburger menu button displays "All Items, About, LogOut, Reset App State"
    Given User visits saucedemo.com
    And User logs in
    When User clicks the hamburger menu button
    Then user verifies that All Items button shows
    And user verifies that About shows
    And user verifies that LogOut shows
    And user verifies that Reset App State shows

  Scenario:  User verifies there are 6 products on the Inventory Page by default
    Given User visits saucedemo.com
    And User logs in
    Then User verifies that 6 products display by default