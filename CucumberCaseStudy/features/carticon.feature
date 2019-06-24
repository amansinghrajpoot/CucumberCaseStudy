
@CartIconValidate
Feature: Validate cart icon
 
  Scenario: validating cart icon
  Given User is on home page for searching.
    When User enters the four characters "Head"
    And press the search button 
    And user proceed for payment
    Then cart icon should not be displayed