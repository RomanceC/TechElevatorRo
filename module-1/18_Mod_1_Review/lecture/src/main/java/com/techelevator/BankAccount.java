package com.techelevator;

import java.math.BigDecimal;

public class BankAccount {

    private final BigDecimal TRANSFER_LIMIT_AMT = new BigDecimal( "25");

    private final BigDecimal MIN_OPENING_DEPOSIT = new BigDecimal( "10");
    private final  BigDecimal MONTHLY_MNT_FEE = new BigDecimal( "5");
    private final BigDecimal ATM_FEE = BigDecimal.valueOf("2.50");

    //instance variables

    private BigDecimal balance = new BigDecimal("0.00");

    //constructor

    public BankAccount(String name){
       this.name = name;
       this.balance = balance;

    }

    //getter and setters

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
