package com.techelevator.mariokart;

public class SmallCart extends Racer{

    public SmallCart(String name) {
        super(name, Racer.SMALL );
    }

    public int getMaxSpeed() {
        return 200;
    }
}
