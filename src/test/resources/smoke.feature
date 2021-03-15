Feature: Smoke
  As a user
  I want to test all main site functional
  So that I can be sure that site works correctly

  Scenario Outline: Check product search by keyword
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    Then User checks that products in a search list contains keyword '<keyword>'

    Examples:
      | homePage                            | keyword | amountOfProducts |
      | https://www.ebay.com                | cake    | 1                |
