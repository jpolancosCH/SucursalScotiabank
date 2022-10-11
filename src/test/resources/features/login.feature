# author: Julian Esteban Polanco Sogamoso
# language: en

@stories
Feature: Login
  As a user I want to login to the application

  @successful_login
  Scenario: Successful login
    Given Than I am on the login page
    When Enter my username and password, and click login button
      | username     | password   |
      | ************ | ********** |
    Then I should see the login message
      | successMessage  |
      | *************** |


  @failed_login
  Scenario: Failed login
    Given Than I am on the login page
    When Enter my username and password, and click login button
      | username  | password  |
      | ********* | ********* |
    Then I should see the error message
      | errorMessage |
      | ***********  |



