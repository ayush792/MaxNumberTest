package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {
    @Test
    public void testinteger() {
        Integer maximum1=20;
        MaxNumber maxnumber=new MaxNumber(20,14,15);
        Integer result = maxnumber.validateMax();
        Assert.assertEquals(maximum1,result);
    }
    @Test
    public void testDouble() {
        Double maximum=23.5;
        MaxNumber maxDouble = new MaxNumber(12.3,23.5,16.8);
        Double resultDouble= maxDouble.validateMaxDouble();
        Assert.assertEquals(maximum,resultDouble);
    }
}
