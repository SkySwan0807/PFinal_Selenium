Feature: Home page

  Background: User login into Sauce demo
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

    Scenario Outline: Verify that all products are displayed in home page
      When The home page should be displayed
      Then The product "<product>" should be displayed
      Examples:
        | product                 |
        | Sauce Labs Backpack     |
        | Sauce Labs Bike Light   |
        | Sauce Labs Bolt T-Shirt |

    Scenario: Delete products from checkout
      Given The home page should be displayed
      And I add the "Sauce Labs Backpack" to the cart
      And I add the "Sauce Labs Bike Light" to the cart
      And I click on the cart icon
      And I remove the "Sauce Labs Backpack" from the cart
      And I remove the "Sauce Labs Bike Light" from the cart
      And I go back to the home page


    Scenario: Add Product from Details Page
      Given The home page should be displayed
      And I enter the "Sauce Labs Bike Light"'s detail page
      And I click on add to cart button
      And I click on the cart icon of the detail page




