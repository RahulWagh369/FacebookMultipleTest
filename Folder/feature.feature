#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: faceboook login validation



  Scenario Outline: login validation with mulitple teat data
    Given facbook login patge alraeday open 
    When the user enters "<username>" and "<password>" 
    Then we got laded on login page

  Examples:
  |	username          |  password   |
  |01rbwagh@gmail.com | rahul@34598 |
  |09rb@gmail.com     | Rahul@1122  |
  |01rbwagh@gmail.com | Rahul@1122  |
  
  
  
  
  
  
  