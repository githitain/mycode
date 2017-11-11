Feature: DC Smoke Test Suite - Development
Scenario: EV_C60332-Verify report links available under Acquisitions -> Expenditure Trends
	
	Given EV User is on DC Home Page
	When EV User is logged in into DC and currently is under Evaluation mode
	Then EV User has verified that Expenditure Trends sub-category is present under Acquisitions
	And EV User Expands Expenditure Trends sub-category
	Then EV User Expenditure Trends sub-category should be expandable and Following reports should be present Expenditure Trends by Bib Level

Scenario: EV_C60821-Verify that no exception is coming up for Expenditure Reports when Vendor Filter "Unknown" is applied

	And EV User Expands Expenditure Trends sub-category and click on the report Expenditure Trends by Bib Level
	Then EV User verifies the Go button
	And EV User clicks on Go button
	Then EV Users verifies the Report Expenditure Trends by Bib Level
	And EV User clicks on sign out link
	Then EV Users verifies the login page
	And EV User quits the browser for C60821	