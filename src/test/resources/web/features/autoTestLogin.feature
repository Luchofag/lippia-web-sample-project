Feature: As a user of AutomationTesting.in i need to test the register page
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

