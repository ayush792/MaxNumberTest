package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {
    @Test
    public void testinteger() {
        Integer maximum1=20;
        MaxNumber maxNumber=new MaxNumber(20,14,15);
        maxNumber.validateMaximum();
        Assert.assertEquals(maximum1,maxNumber.max);
    }
    @Test
    public void testDouble() {
        Double maximum=23.5;
        MaxNumber maxNumber = new MaxNumber(12.3,23.5,16.8);
        maxNumber.validateMaximum();
        Assert.assertEquals(maximum,maxNumber.max);
    }
    @Test
    public void testString() {
        String maximum = "zoya";
        MaxNumber maxNumber = new MaxNumber("sourabh", "karan", "zoya");
        maxNumber.validateMaximum();
        Assert.assertEquals(maximum,maxNumber.max);
    }
}
