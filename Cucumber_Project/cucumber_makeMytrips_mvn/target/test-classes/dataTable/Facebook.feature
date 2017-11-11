@FacebookTestingRegression
Feature: Facebook Testing
Scenario: Verify that Search functinality for Facebook.


Given I am on the new user registration page
When I enter invalid data on the page

| Fields                 | Values              |
| First Name             | Tom                 |
| Last Name              | Kenny               |
| Email Address          | someone@someone.com |
| Re-enter Email Address | someone@someone.com |
| Password               | Password1           |
| Birthdate              | 01                  |
| Search Term            | selenium 					 |
| Birthdate              | 01                  |

Then Close Facebook application