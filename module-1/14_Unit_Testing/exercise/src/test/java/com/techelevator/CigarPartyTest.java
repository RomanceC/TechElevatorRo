package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class CigarPartyTest {
    @Test

    public void test_min_count() {
        CigarParty cigarParty = new CigarParty();

        boolean result = cigarParty.haveParty(42, true);

        Assert.assertEquals(true, result);
    }
}

