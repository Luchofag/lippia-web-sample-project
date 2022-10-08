Feature: As a user of AutomationTesting.in i need to test some test cases

  Scenario: Home Page with three Sliders only
    Given The user is in AutomationTesting.in Page
    When The user is in the home page, click the shop button from the menu items
    And Return to the home page, using the home button
    Then The user can see three arrivals only
