Feature: Login into Salesforce application

Background: This is to launch the application
Given user is on salesforce application

@test

Scenario: User should click on Usermenudropdown
Then user enter the valid username "firstlast12345@es.com"
And user enter the valid password "Newuser@12345"
Then click on login button
Then click on usermenudropdown
