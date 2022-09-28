Feature: Buy a product testing

  Scenario: Navigate to site and verify if you in correct page

    Given navigate to url
    And close cookie
    And move from clothing and accessories to knee high socks
    And filter product
    And choose product
    And verify product color
    And click add to cart
    And click go to shop
    And click proceed to checkout
    And click continue without registration
    And type email
    And click continue
    And click create new address
    And type address title
    And type name
    And type lastname
    And type mobile phone
    And choose city
    And choose district
    And choose neighbourhood
    And type address
    And click save
    When click save and continue
    Then verify payment page
    Then quit
