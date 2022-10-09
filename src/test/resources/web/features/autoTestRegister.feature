Feature: As a user of AutomationTesting.in i need to test the login page

  @Register @Smoke
  Scenario Outline: Register with empty email-address text box
    Given User is in Automation Testing Practice Site
    When user enter in 'My account' page
    And Enter empty Email Address in Email-Address textbox, and enter a valid <password> in password textbox, and click on Register button
    Then Registration must fail with a warning message 'please provide valid email address'
    Examples:
    |password   |
    |192837192837912873!!!askjhdakjshd|
    |!!!askjhdakjshd192837192837912873|


  @Register2 @Smoke
  Scenario Outline: Register with empty password text box
    Given The user is in AutomationTesting.in Site
    When Click on My Account Menu
    And  Enter valid <email> in Email-Address textbox, enter empty password in password textbox and click on Register button
    Then Registration must fail with a warning message 'please enter an account password'
    Examples:
    |email            |
    |usuario1@mail.com|
    |usuario2@mail.com|
    |usuario3@mail.com|
