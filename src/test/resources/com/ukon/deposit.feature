@deposit
Feature: Depositing money into User account

  Scenario Outline: : Depositing money into User account should add money to the current balance
    Given a User has an account
    And current balance is <currentBalance>
    When <amount> pound is deposited
    Then the balance should be <balance> pound

  Examples:
    | currentBalance | amount | balance |
    | 0              | 100    | 100     |
    | 50             | 200    | 250     |
    | 100            | 300    | 400     |







