Feature: As a user of AutomationTesting.in i need to test the home page

  @Arrival @Smoke
  Scenario: Home Page with three Arrivals only
    Given The user is in AutomationTesting.in Page
    When The user is in the home page, click the shop button from the menu items
    And Return to the home page, using the home button
    Then The user can see three arrivals only

  @Slider @Smoke
  Scenario: Home Page with three Sliders only
    Given User is in AutomationTesting.in Page
    When User is in the home page, click on the shop button from the menu items
    And user will back to the home page, using the home button
    Then The user can see three sliders only


