package com.bridgelabz;

public class MaxNumber {
    X x,y,z;
    X max;

    public MaxNumber(X x, X y, X z) {
        this.x=x;
        this.y = y;
        this.z=z;
    }

    public <E> void validateMax() {
        if(x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            max = m;
        } else if(y.compareTo(x) > 0 && y.compareTo(z) > 0) {
            max =y;
        } else {
            max =z;
        }
    }
}