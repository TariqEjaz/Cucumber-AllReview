@wip
Feature: Google search functionality
  Agile story : when i am at Google search page
  I should be able to search whatever i want

  Scenario: Search page title verification
    When user is on google search page
    Then user should see title is Google

    Scenario: Search Functionality Title Verification
      When user is on google search page
      And user types apple in the google search box and clicks enter
      Then user sees apple is in the google title



