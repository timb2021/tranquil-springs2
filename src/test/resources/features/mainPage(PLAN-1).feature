Feature: Landing Page test

  Scenario: Landing page should have navigation tabs
    Given I navigate to Project website
    Then I should see the "PlanIT" page
    Then I verify the following dashboards are displayed:
      | summary      |
      | income       |
      | expense      |
      | forecast     |
      | settings     |
