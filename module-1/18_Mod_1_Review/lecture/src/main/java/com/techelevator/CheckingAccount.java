package com.techelevator;

import java.math.BigDecimal;

// if we want to inherit from another class, we say extends
// and then that other class name

public class CheckingAccount extends BankAccount {

    private final BigDecimal OVERDRAFT_FEE = new BigDecimal( "20.00");

    //instance variables

    private boolean

    public CheckingAccount(String name) {
        super(name);

    }

    public CheckingAccount(String name, BigDecimal balance){
        super(name, balance);
    }
}
//getters and setters

    //NOTE: when a variable is a boolean, we use "is" instead of "get" when naming the getter
    public boolean isRequestedDebitCard() {
        return requestedDebitCard;
    }

    public void setRequestedDebitCard(boolean requestedDebitCard) {
        this.requestedDebitCard = requestedDebitCard;
    }
}