
Feature: Examples of Cucumber data table implementations
@wip
  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |

    Scenario: User should be able to see all 12 months in months dropdown
      Then user should see month I like
        | January   |
        | February  |
        | March     |
        | April     |
        | May       |
        | June      |
        | July      |
        | August    |
        | September |
        | October   |
        | November  |
        | December  |
