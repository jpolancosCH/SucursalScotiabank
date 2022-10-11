# author: Julian Esteban Polanco Sogamoso
# language: en

@stories
Feature: Credit cards payment
  As a user of Scotiabank Colpatria,
  I want to pay my credit card bill
  so that I use the web page to pay my credit card bill.

  Background: The user is logged in
    Given Than I am on the login page
    When Enter my username and password, and click login button
      | username       | password   |
      | ************** | ********** |

  @successful_payment_entering_amount
  Scenario Outline: Successful payment, enter the amount to pay
    Given Than I am on the credit card payment page
    When Complete all the fields
      | cardNumber   | amount   |
      | <cardNumber> | <amount> |
    Then I should see the message
      | lastMessage   |
      | <lastMessage> |
    Examples:
      | cardNumber       | amount    | lastMessage                  |
      | **************** | ********* | **************************** |

