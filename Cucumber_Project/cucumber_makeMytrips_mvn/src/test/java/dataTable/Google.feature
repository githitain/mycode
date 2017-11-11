@GoogleTestingRegression
Feature: Google Testing

@Passed
Scenario: Verify that Search functinality for Google.


Given I am on the Google page
When I enter Search Term and click on submit button


 

| Fields                 | Values              |
| First Name             | Tom                 |
| Last Name              | Kenny               |
| Email Address          | someone@someone.com |
| Re-enter Email Address | someone@someone.com |
| Password               | Password1           |
| Birthdate              | 01                  |
| Search Term            | selenium 					 |
| Birthdate              | 01                  |

Then Close the Application


Scenario: Verify that Gmail functinality for Google.
Given I am on the Google page
When I Click on the Gmail link 
Then Close the Application


Scenario: Verify that Sign in functinality for Google.
Given I am on the Google page
When I Click on the Sign in link 
Then Close the Application

Scenario: Verify that Images in functinality for Google.
Given I am on the Google page
When I Click on the Images link 
Then Close the Application