#Date
#Author
#Description

Feature: feature to test google search functionality		

@GoogleSearchTest
Scenario: Validate google search functionality

Given browser is open 
And user is on google search page
When user enters search text
And user hits enter
Then user is navigated to the search results