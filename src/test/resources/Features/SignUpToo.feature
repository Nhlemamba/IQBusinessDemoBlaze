@signing
Feature: Login with Properties File

  Background:
    Given I am on the demoblaze landing page

  Scenario: Login using credentials from properties file
    And I click on the Sign up option
    And I enter sign up credentials from properties file
    When I click the Sign up button
    Then a confirmation message should appear in a pop-up
@ordering
  Scenario: Place an order with shipping details from properties file
    When I click login
    And I log in with credentials from properties file
    Then I should see the homepage
    When I add an Asus Monitor to the cart
    And I add a Nexus phone to the cart
    And I open the cart page
    Then all items should be displayed in the cart
    And the total amount should be visible
    And the order form is displayed
    When I enter my username to fill form
    And I enter shipping details from properties file
    And I click the purchase button
    Then the order confirmation should be displayed


