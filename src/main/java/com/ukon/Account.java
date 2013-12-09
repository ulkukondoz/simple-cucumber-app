package com.ukon;

/**
 * Created with IntelliJ IDEA.
 * User: ukondoz
 * Date: 09/12/2013
 * Time: 09:12
 * To change this template use File | Settings | File Templates.
 */
public class Account {
    private int balance;

    public Account() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
       this.balance +=amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
