Feature: DC Smoke Test Suite - Evaluation
Scenario: C60332-Verify report links available under Acquisitions -> Expenditure Trends
	
	Given User is on DC Home Page
	When User is logged in into DC and currently is under Evaluation mode
	Then User has verified that Expenditure Trends sub-category is present under Acquisitions
	And User Expands Expenditure Trends sub-category
	Then User Expenditure Trends sub-category should be expandable and Following reports should be present Expenditure Trends by Bib Level

Scenario: C60821-Verify that no exception is coming up for Expenditure Reports when Vendor Filter "Unknown" is applied

	And User Expands Expenditure Trends sub-category and click on the report Expenditure Trends by Bib Level
	Then User verifies the Go button
	And User clicks on Go button
	Then Users verifies the Report Expenditure Trends by Bib Level
	And User clicks on sign out link
	Then Users verifies the login page
	And User quits the browser for C60821	