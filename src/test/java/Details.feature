Feature System for purchasing DVDs:
  Scenario: An user enters his username and password to get access to the system
    Given url 'http://localhost:3308/'
    When method GET
    Then status 200
  Scenario: Customer succesfully orders a DVD
    Given url 'http://localhost:3308/'
    When method POST
    Then status 202
  Scenario: The order status is updating
    Given url 'http://localhost:3308/'
    When method GET
    Then status 201
  Scenario: The shopping card status is updating:
    Given url 'http://localhost:3308/'
    When method POST
    Then status 201
  Scenario: Payment failed:
    Given url 'http://localhost:3308/'
    When method POST
    Then status 400
  Scenario: Payment succeed:
    Given url 'http://localhost:3308/'
    When method POST
    Then status 202
  Scenario: Customer Cancels order:
    Given url 'http://localhost:3308/'
    When method DELETE
    Then status 200
    And match $ == {Status:"cancelled"}