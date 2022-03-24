@Regression @smoke
Feature: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

  @librarian @wip
  Scenario: login as librarian
    Given user is on the library login page
    When user enter librarian username
    And user enter librarian password
    Then user should see the dashboard

  @student
  Scenario: login as student
    When user enter student username
    And user enter student password
    Then user should see the dashboard

    @admin
  Scenario: login as admin
    When user enter admin username
    And user enter admin password
    Then user should see the dashboard


