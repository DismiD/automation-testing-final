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

  Scenario Outline: Check register components visibility
    Given User opens '<homePage>' page
    When User clicks register button
    And User checks first name field visibility
    And User checks last name field visibility
    And User checks email field visibility
    And User checks password field visibility
    And User checks Create account button visibility
    And User checks Create account button is disabled
    And User checks Continue with Google  button visibility
    And User checks Continue with Facebook  button visibility
    And User checks Continue with Apple  button visibility
    And User enters first name '<firstName>'
    And User enters last name '<lastName>'
    And User enters email '<email>'
    And User enters password '<password>'
    Then User checks if Create account button is enabled

    Examples:
      | homePage                    | firstName  | lastName  | email           | password|
      | https://www.ebay.com        |  Andrii    | Stroiev   |test@gmail.com   | a1234567 |

  Scenario Outline: Check sign in components visibility
    Given User opens '<homePage>' page
    When User clicks Sign in button
    And User checks email or username field visibility
    And User checks Continue button visibility
    And User checks Continue with Apple button visibility
    And User checks Continue with Google button visibility
    And User checks Continue with Facebook button visibility
    Then User checks that stay signed in checkbox is selected

    Examples:
      | homePage              |
      | https://www.ebay.com  |

  Scenario Outline: Check add product to cart
    Given User opens '<homePage>' page
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks on first product
    And User checks that Add to cart button visible
    And User clicks on Add to cart button
    And User checks number of products in cart equals '<numberOfProductsInCart>'
    Then User checks that cart has added product '<keyword>'

    Examples:
      | homePage                            | keyword                   |numberOfProductsInCart |
      | https://www.ebay.com                | hp hpe microserver gen 8  | 1                     |