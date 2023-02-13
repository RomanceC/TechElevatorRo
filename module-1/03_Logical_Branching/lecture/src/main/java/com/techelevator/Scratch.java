package com.techelevator;

public class Scratch {

    public static int withdraw(int balance, boolean isKeyBankAtm, int withdraw) {

        int minimumBalance = balance - 5;

        // check if our withdraw amount is less than or equal to our balance and that this is a keybank atm
        if (withdraw <= balance && isKeyBankAtm) {

            balance = balance - withdraw;

            //if this is a keybank atm , then thank the customer
            if (isKeyBankAtm) {
                System.out.println("Thank you for banking at KeyBank!");
            } else {

            }


        } else if (withdraw <= minimumBalance) {
            balance = balance - withdraw;
        } else {
            System.out.println("You don't have a sufficient balance");
        }


        System.out.println("Our balance is: $" + balance);
        return balance;

    }
}


