package com.adhithiya.abstraction.lab2;

public class B extends Marks{
    int m1,m2,m3,m4;
    B(int m1,int m2,int m3,int m4)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
    }
    @Override
    double getPercentage() {
        return ((m1+m2+m3+m4)/400.0)*100;
    }
}
