package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override

    public int withdraw(int amountToWithdraw) {

        if (getBalance() - amountToWithdraw < 0 && getBalance() - amountToWithdraw > -100) {
            super.withdraw(amountToWithdraw + 10);
            return getBalance();

        } else if (getBalance() - amountToWithdraw >= 0) {
            super.withdraw(amountToWithdraw);
            return getBalance();
        } else {
            return getBalance();
        }
    }
}