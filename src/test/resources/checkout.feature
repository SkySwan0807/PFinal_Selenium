Feature: Checkout feature

  Background: User should be logged
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: User can checkout a purchase
    Given The home page should be displayed
    And I add the "Sauce Labs Backpack" to the cart
    And I click on the cart icon
    When I click on the checkout button
    And I fill the checkout information with
      | Nicolas | Vargas | 0000 |
    And I click on the continue button
    When I click on the finish button
    Then A message that says "Thank you for your order!" should be displayed

  Scenario: User cannot checkout an empty purchase
    Given The home page should be displayed
    And I click on the cart icon
    When I click on the checkout button
    And I fill the checkout information with
      | Nicolas | Vargas | 12345 |
    And I click on the continue button
    When I click on the finish button
    Then A message that says "Thank you for your order!" should be displayed
    Then If you reach this point the test failed

  Scenario: Checkout a purchase without any information
    Given The home page should be displayed
    And I add the "Sauce Labs Backpack" to the cart
    And I click on the cart icon
    When I click on the checkout button
    And I click on the continue button
    Then A error message that says "Error: First Name is required" should say

