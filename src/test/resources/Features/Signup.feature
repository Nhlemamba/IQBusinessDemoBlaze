@signup
Feature: User Signup
  As a new user, I want to create an account so that I can access the application.

  Background:
    Given I am on the demoblaze landing page

  Scenario Outline: Successful signup with valid credentials
    And I click on the Sign up option
    And I enter the username <username>
    And I enter the password <password>
    When I click the Sign up button
    Then a confirmation message should appear in a pop-up

    Examples:
      | username | password    |
      | te2r1    | password123 |


@addingToCart
  Scenario Outline: Add items to cart
    When I click login
    And I enter login username <username>
    And I enter login password <password>
    And I click login button
    Then the homepage is displayed
    When I navigate to Monitor
    And I click Asus monitor
    And I click add to cart
    And I click home page
    And I click Phones
    And I click Nexus
    And I click add to cart
    And I click cart page
    Then the items are displayed
    And the total amount is displayed

    Examples:
      | username  | password |
      | userGH251 | test3    |



