@RegisterTesting
Feature: Register to TestMeApp
 

  Scenario Outline: Register Test
    Given User is on sign up page
    When User enters data "<username>" and "<fname>" and "<lname>" and "<pwd>" and "<cpwd>" and "<gender>" and "<email>" and "<mobile>" and "<dob>" and "<address>" and <sque> and "<ans>"
    And user clicks on Signup
    Then I verify the <status> in step

    Examples: 
      | username | fname | lname   | pwd         | cpwd        | gender | email         | mobile     | dob        | address         | sque | ans    | status |
      | user609000 | Aman  | Rajpoot | Password123 | Password123 | Male   | abc@gmail.com | 9584762158 | 19/09/1997 | Minal residency |    0 | Bhopal | Pass   |
