@YahooTestingRegression
Feature: Yahoo Testing

@Passed
Scenario: Verify that Login functinality for Yahoo


Given I am on the Yahoo Home page
When I Click Login link
Then Close the Yahoo link

@Failed
Scenario: Verify that Email functinality for Yahoo

Given I am on the Yahoo Home page
When I Click on Email link
Then Close the Yahoo link

@Missing
Scenario: Verify that Cricket functinality for Yahoo

Given I am on the Yahoo Home page
When I Click Cricket link
And Yahoo Home
Then Close the Yahoo link	
