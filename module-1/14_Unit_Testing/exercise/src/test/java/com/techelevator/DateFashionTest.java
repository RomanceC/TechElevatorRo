package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
    @Test
    public void test_get_a_table (){
        DateFashion dateFashion = new DateFashion();

        int result = dateFashion.getATable( 5, 10);

        Assert.assertEquals(2, result);

    }
    @Test
    public void test_get_a_maybe() {

       DateFashion dateFashion = new DateFashion();

       int result = dateFashion.getATable( 5 , 5 );
        Assert.assertEquals(1, result);
    }


            @Test

     public void test_get_a_no(){

    DateFashion dateFashion = new DateFashion();

    int result = dateFashion.getATable( 5, 2);
    Assert.assertEquals(0, result);

    }

}
