Feature: uber booking feature

 @Smoke
  Scenario: Booking Cab
    Given User wants to select a car type "Sedan" from uber app
    When user selects car "Sedan" and pickup from "Bangalore" and drop location "Pune"
    Then Driver starts journey
    And Driver ends the journey
    Then User pays 1000 USD

    
   
@Regression
  Scenario: Booking Cab SUV
    Given User wants to select a car type "Sedan" from uber app
    When user selects car "Sedan" and pickup from "Bangalore" and drop location "HYD"
    Then Driver starts journey
    And Driver ends the journey
    Then User pays 2000 USD
    
  @production  
    Scenario: Booking Cab mini
    Given User wants to select a car type "Sedan" from uber app
    When user selects car "Sedan" and pickup from "Bangalore" and drop location "pune"
    Then Driver starts journey
    And Driver ends the journey
    Then User pays 2100 USD
    