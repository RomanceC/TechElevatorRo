package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class FrontTimesTest {
    @Test

    public void test_first_3_chars() {

        FrontTimes frontTimes = new FrontTimes();

        String result = frontTimes.generateString( "Chocolate", 2);
        Assert.assertEquals("ChoCho", result);

    }

    @Test

    public void test_first_3_chars_3() {

        FrontTimes frontTimes = new FrontTimes();
        String result = frontTimes.generateString("Chocolate", 3);
        Assert.assertEquals("ChoChoCho", result);
}
   @Test

    public void test_first_3_chars_less_than_3() {

        FrontTimes frontTimes = new FrontTimes();
        String results = frontTimes. generateString( "Abc", 3);
        Assert.assertEquals("AbcAbcAbc", results);
   }

}
