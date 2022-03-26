
Feature: user should be able to login with correct credential

  Background:  user is on login page
    Given user is on the login page of the Web_Table_App
  Scenario: Positive login scenario
    When user enter the correct username "Test"
    And user enter the correct password "Tester"
    And user click the on the login button
    Then user should see url contains orders


  Scenario: Positive login scenario
    When user enter the correct username "Test" password "Tester" then click
    Then user should see url contains orders

  @wip
  Scenario: User should be able to see all 12 months in months dropdown
    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders