Feature: Income page

  Scenario: Income page
    Given I navigate to Project website
    Then I click "Income" link
    Then I verify the following input fields are displayed:
      | Name        |
      | Description |
      | Amount      |
    Then I verify the fields from dropdown "Type"
      | Type   |
      | Salary |
      | Rental |

    Then I verify the fields from dropdown "Frequency"
      | Frequency  |
      | Daily      |
      | Weekly     |
      | Bi-weekly  |
      | Monthly    |
      | Bi-monthly |
      | Quarterly  |
      | Annually   |