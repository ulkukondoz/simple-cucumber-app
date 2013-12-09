package com.ukon;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: ukondoz
 * Date: 09/12/2013
 * Time: 09:39
 * To change this template use File | Settings | File Templates.
 */

public class DepositStepDefinition {
    private Account account;
    private User user;

    @Given("^a User has an account$")
    public void userHasAnAccount() {
        account = new Account();
        user = new User();
        user.setAccount(account);
    }

    @Given("^current balance is (\\d+)$")
    public void userHasNoMoney(int currentBalance) {
        account.setBalance(currentBalance);
        user.setAccount(account);

        assertTrue("Balance should be same", account.getBalance() == currentBalance);
    }

    @When("^(\\d+) pound is deposited$")
    public void amountDepositedToAccount(int amount) {
        account.deposit(amount);
    }

    @Then("^the balance should be (\\d+) pound$")
    public void balanceShouldIncrease(int expectedBalance) {
        int currentBalance = account.getBalance();

        assertTrue("Balance should be same", currentBalance == expectedBalance);
    }

}
