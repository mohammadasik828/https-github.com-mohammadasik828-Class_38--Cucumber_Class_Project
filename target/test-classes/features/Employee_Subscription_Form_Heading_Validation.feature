Feature: Employee Subsciption Form Heading Validation
  As an Employee
  I want to see heading of the web page
  So that I can confirm the web page

  Scenario: Verify Employee Subscription Form Heading
    Given I am in Employee Subscription Page
    When I load the page in browser
    Then verify the page Title is "Employee Subscription Form"
