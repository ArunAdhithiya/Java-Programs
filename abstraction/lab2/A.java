package com.adhithiya.abstraction.lab2;

public class A extends Marks{
    int m1,m2,m3;
    A(int m1,int m2,int m3)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    @Override
    double getPercentage() {
        return ((m1+m2+m3)/300.0)*100;
    }
}
