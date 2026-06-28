#Date
#Author
#Description

@GoogleSearchTest
Feature: feature to test google search functionality

Background: User has everything
Given user is on google search page

Scenario: Validate google search functionality
When user enters search text
And user hits enter
Then user is navigated to the search results