Feature: Login functionality




Scenario: successfully login with valid crediantles.
Given user lunch the chrome browser
When user opends url
And user Enter user name as "testdemo@gmail.com"
And user Enter Password as "123456"
And user clicked login button
Then Check the Title of the page
And close the browser 


Scenario Outline: Login Data Driven Test
Given user lunch the chrome browser
When user opends url
And user Enter user name as "<email>"
And user Enter Password as "<password>"
And user clicked login button
Then Check the Title of the page
And close the browser

Examples:

| email | password |
|testdemo@gmail.com  | 123456 |
|testdemo1@gmail.com | 123456 |



