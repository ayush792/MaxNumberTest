package com.bridgelabz;

public class MaxNumber {
    Integer x,y,z;
    Double num1,num2,num3;

    public MaxNumber(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MaxNumber(Double num1, Double num2, Double num3) {
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public Integer validateMax() {
        Integer max;
        if(x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            max = x;
        } else if(y.compareTo(x) > 0 && y.compareTo(z) > 0) {
            max =y;
        } else {
            max =z;
        }
        return max;
    }

    public Double validateMaxDouble() {
        Double max;
        if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
        {
            max = num1;
        }
        else if(num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
        {
            max = num2;
        }
        else {
            max = num3;
        }
        return max;
    }
}
