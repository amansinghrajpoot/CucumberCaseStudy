@LoginTest
Feature: Login test
 
 Scenario Outline: Login Test
    Given User is on login page
    When User enters data "<username>" and  "<pwd>" 
    And user clicks on login
    Then login verify the <status> in step

    Examples: 
      |username|pwd|status|
      |user60900|Password123|Pass|
 