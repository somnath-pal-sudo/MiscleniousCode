Feature: calculate billing amount

  Scenario Outline: billing amount
    Given user is on biling page
    When user enters billing amount  <biling amount>
    When userenters tax amount <taxamount>
    And user clicks on calculate button
    Then it gives the final amount <finalamount>

    Examples: 
      | bilingamount |  | taxamount |  | finalamount |
      |          100 |  |         1 |  |         112 |
      |          200 |  |       2.2 |  |      222.33 |
      |          110 |  |        10 |  |         111 |
