$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/III_Automation/Worksapces/DC_BDD/src/stepDefination/DC_Evalution.features");
formatter.feature({
  "line": 1,
  "name": "DC Smoke Test Suite - Evaluation",
  "description": "",
  "id": "dc-smoke-test-suite---evaluation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "C60332-Verify report links available under Acquisitions -\u003e Expenditure Trends",
  "description": "",
  "id": "dc-smoke-test-suite---evaluation;c60332-verify-report-links-available-under-acquisitions--\u003e-expenditure-trends",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on DC Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is logged in into DC and currently is under Evaluation mode",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User has verified that Expenditure Trends sub-category is present under Acquisitions",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Expands Expenditure Trends sub-category",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Expenditure Trends sub-category should be expandable and Following reports should be present Expenditure Trends by Bib Level",
  "keyword": "Then "
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_is_on_DC_Home_Page()"
});
formatter.result({
  "duration": 12085743305,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_is_logged_in_into_DC_and_currently_is_under_Evaluation_mode()"
});
formatter.result({
  "duration": 2720136546,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_has_verified_that_Expenditure_Trends_subcategory_is_present_under_Acquisitions()"
});
formatter.result({
  "duration": 370704622,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.And_User_Expands_Expenditure_Trends_sub_category()"
});
formatter.result({
  "duration": 346945388,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.Expenditure_Trends_subcategory_should_be_expandable_and_Following_reports_should_be_present()"
});
formatter.result({
  "duration": 541591973,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "C60821-Verify that no exception is coming up for Expenditure Reports when Vendor Filter \"Unknown\" is applied",
  "description": "",
  "id": "dc-smoke-test-suite---evaluation;c60821-verify-that-no-exception-is-coming-up-for-expenditure-reports-when-vendor-filter-\"unknown\"-is-applied",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User Expands Expenditure Trends sub-category and click on the report Expenditure Trends by Bib Level",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User verifies the Go button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on Go button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Users verifies the Report Expenditure Trends by Bib Level",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User clicks on sign out link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Users verifies the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User quits the browser for C60821",
  "keyword": "And "
});
formatter.match({
  "location": "DC_Evalution_StepDef.And_User_Expands_Expenditure_Trends_sub_category_click_on_a_report()"
});
formatter.result({
  "duration": 4385771407,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_verify_the_Go_button()"
});
formatter.result({
  "duration": 4158420025,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_clicks_on_Go_button()"
});
formatter.result({
  "duration": 7408014852,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_verifies_the_Report_Expenditure_Trends_by_Bib_Level()"
});
formatter.result({
  "duration": 4164672776,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_clicks_on_signout_link()"
});
formatter.result({
  "duration": 4152518872,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_verifies_the_login_page()"
});
formatter.result({
  "duration": 4041644585,
  "status": "passed"
});
formatter.match({
  "location": "DC_Evalution_StepDef.User_close_browser_C60821()"
});
formatter.result({
  "duration": 2850366420,
  "status": "passed"
});
});