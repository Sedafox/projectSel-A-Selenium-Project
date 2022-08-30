Feature: Tests sauce demo page

  @jeff
  Scenario: Logs in to Sauce Demo
    Given User visits saucedemo.com
    And User logs in
    Then user is taken to inventory page