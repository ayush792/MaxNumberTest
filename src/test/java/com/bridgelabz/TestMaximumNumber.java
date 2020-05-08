package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {
    @Test
    public void testinteger() {
        Integer maximum1=20;
        MaxNumber maxnumber=new MaxNumber(20,14,15);
        maxnumber.validateMax();
        Assert.assertEquals(maximum,maxnumber.max);
    }
}
