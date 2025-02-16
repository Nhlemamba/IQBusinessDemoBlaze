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
      | Ze2r1    | password123 |


  @addingToCart
  Scenario Outline: Add items to cart
    When I click login
    And I log in with username <username> and password <password>
    Then I should see the homepage
    When I add an Asus Monitor to the cart
    And I add a Nexus phone to the cart
    And I open the cart page
    Then both items should be displayed in the cart
    And the total amount should be visible

    Examples:
      | username | password    |
      | te2r1    | password123 |






