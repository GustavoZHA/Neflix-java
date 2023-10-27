Feature: HomePage Verification

  Scenario: Verifies tittle and url in Netflix home page
    Given I navigate to the home page
    When I Maximize screen
    Then I verify tittle should be "Netflix Bolivia - Watch TV Shows Online, Watch Movies Online"
      And I verify url should be "https://www.netflix.com/bo-en/"