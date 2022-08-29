Feature: Tests youtube home page

  @jeff
  Scenario: Clicks the Youtube Home button
    Given User visits youtube
    When User clicks youtube home button in top left
    Then user is on the youtube home page

  @jeff2
  Scenario: Clicks the Explore Button on Home Page
    Given User visits youtube
    When user clicks Explore button on left hand side of page
    Then user observes Trending and Music buttons