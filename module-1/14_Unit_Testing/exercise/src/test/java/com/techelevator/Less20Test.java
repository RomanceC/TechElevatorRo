package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class Less20Test {

    @Test

    public void testIf1LessThan20() {
            Less20 less20 = new Less20();

            boolean result = less20.isLessThanMultipleOf20(19);
            Assert.assertEquals(true, result);
        }


        @Test

        public void testIf2LessThan20 () {
            Less20 less20 = new Less20();
            boolean result = less20.isLessThanMultipleOf20(40);
            Assert.assertEquals(false, result);


        }

    }

