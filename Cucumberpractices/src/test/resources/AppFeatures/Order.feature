Feature: HomePage
  In order to check my order details
  As a registred user 
  I want to specify the fegatures of the order details page

  Background: 
    Given a registerd user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page

  Scenario: Check previuos Order Details
    When users click on Order details
    Then user checks previous order details
