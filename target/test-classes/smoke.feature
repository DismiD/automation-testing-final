Feature: Smoke
  As a user
  I want to test all main site functional
  So that I can be sure that site works correctly

  Scenario Outline: Check product searching by keyword
    Given User opens '<homePage>' page
    And User checks search field visibility
    And User checks search button visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    Then User checks that products in a search list contains keyword '<keyword>'

    Examples:
      | homePage                            | keyword |
      | https://www.ebay.com                | Iphone  |

  Scenario Outline: Check site main components visibility
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks footer visibility
    And User checks search field visibility
    And User checks cart visibility
    And User checks that notification icon visibility
    And User checks register button visibility
    And User checks sign in button visibility
    And User checks ship to button visibility
    And User checks help and contact button visibility
    And User checks watchlist button visibility
    And User checks shop by category button visibility
    When User clicks Shop by category button
    And User checks Shop by category popup visibility
    Then User checks that see all categories button is visible

    Examples:
      | homePage                            |
      | https://www.ebay.com                |