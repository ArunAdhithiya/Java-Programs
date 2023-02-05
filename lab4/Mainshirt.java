package com.adhithiya.lab4;

public class Mainshirt {
    public static void main(String[] args) {
        shirt[] obj=new shirt[3];
        obj[0]=new shirt(21,10);
        obj[1]=new shirt(22,23);
        obj[2]=new shirt(23,25);
        obj[0].method();
        obj[1].method();
        obj[2].method();


    }
}
