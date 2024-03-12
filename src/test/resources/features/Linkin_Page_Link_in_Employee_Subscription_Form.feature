Feature: Linkin_Page_Link_in_Employee_Subscription_Form
  As an Employee
  I want to have my linkedin URL Link
  So that I can visit directly from My Page

  Scenario: Verify Page Link in Employee Subscription Form
    Given I am in Employee Subscription Page
    When I load the page in browser
    Then I can see then link of my Login Page
