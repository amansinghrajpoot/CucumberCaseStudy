@CartTesting
Feature: Testing Cart Product

  Scenario Outline:  Adding product to cart
    Given User is on home page for searching
    When User enters four characters "<search>"
    And press search button
    Then User should see accurate result
   
   #enter examples with spaces
    Examples: 
      |search| 
      |Head|
      |Hand|