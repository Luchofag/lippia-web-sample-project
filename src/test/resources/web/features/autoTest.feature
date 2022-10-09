Feature: As a user of AutomationTesting.in i need to test some test cases

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

  @Login @Smoke
  Scenario Outline: Login with incorrect username and incorrect password
    Given The user is in Automation Testing Practice Page
    When User enter in 'My Account' page
    And put incorrect <username> in username textbox, and incorrect <password> in password text box and click on login button
    Then Proper error must be displayed 'Invalid username' and prompt to enter login again
    Examples:
      |username |password   |
      |asdasd123|123asdasd  |
      |juancito |oticnauj   |
      |dasdasr  |dassda2asrf|
      |ososopep |asdasdwqe  |

  @Login2 @Smoke
  Scenario Outline: Login with valid username and empty password
    Given The user is in Automation Testing Practice Site
    When the user enter in 'My account' page
    And put a valid <username> in username textbox, and empty in password text box and click on login button
    Then Proper error must be displayed 'Invalid password' and prompt to enter login again
    Examples:
      |username |
      |usuario1@mail.com|
      |usuario2@mail.com|
      |usuario3@mail.com|
      |usuario4@mail.com|

  @Register @Smoke
  Scenario Outline: Register with empty email-address text box
    Given User is in Automation Testing Practice Site
    When user enter in 'My account' page
    And Enter empty Email Address in Email-Address textbox, and enter a valid <password> in password textbox, and click on Register button
    Then Registration must fail with a warning message 'please provide valid email address'
    Examples:
    |password   |
    |nasfl12341 |
    |1234qweiou |
    |qwerty12345|
    |12345qwerty|

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
    |usuario4@mail.com|