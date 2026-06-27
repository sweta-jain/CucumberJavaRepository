#Date
#Author
#Description

Feature: test login functionality		

@SmokeTest
Scenario: Successful login with valid credentials

Given user is on login page	
When user enters username and password
And clicks on login button
Then user is navigated to the homepage

#Scenario Outline: Successful login with valid credentials

#Given user is on login page	
#When user enters <username> and <password>
#And clicks on login button
#Then user is navigated to the homepage

#Examples:
#|username| password|
#|user1   | pass1   |
#|user2   | pass2   |
