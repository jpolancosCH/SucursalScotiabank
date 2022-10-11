# author: Julian Esteban Polanco Sogamoso
# language: en

@stories
Feature: Login
  As a user I want to login to the application

  @successful_login
  Scenario Outline: Successful login
    Given Than I am on the login page
    When Enter my username and password, and click login button
      | username   | password   |
      | <username> | <password> |
    Then I should see the login message
      | successMessage   |
      | <successMessage> |
    Examples:
      | username | password    | successMessage |
      | ******   | *********** | ********       |

  @failed_login
  Scenario Outline: Failed login
    Given Than I am on the login page
    When Enter my username and password, and click login button
      | username   | password   |
      | <username> | <password> |
    Then I should see the error message
      | errorMessage   |
      | <errorMessage> |
    Examples:
      | username    | password    | errorMessage                                                                       |
      | *********** | *********** | El usuario y / o la contraseña que ingresaste no coinciden con nuestros registros. |


