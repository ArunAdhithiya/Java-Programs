package com.adhithiya.abstraction.lab2;

public class Area extends Shape{
    int l,b,s,r;
    @Override
    void RectangleArea(int l, int b) {
        this.l=l;
        this.b=b;
        System.out.println("area:"+(l*b));
    }

    @Override
    void SquareArea(int s) {
        this.s=s;
        System.out.println("area:"+(Math.pow(s,2)));
    }

    @Override
    void CircleArea(int r) {
        this.r=r;
        System.out.println("area:"+(Math.PI*r*r));
    }
}
