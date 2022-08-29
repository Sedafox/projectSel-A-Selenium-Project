Feature: Tests youtube home page

  @jeff
  Scenario: Clicks the Youtube Home button
    Given User visits youtube
    When User clicks youtube home button in top left
    Then user is on the youtube home page