package com.adhithiya.lab3;

import java.util.Scanner;

public class swimmingPool {
    public static void main(String[] args) {
        final double RATE_OF_FLOW=50.0;
        final double CAPACITY=7.5;
        Scanner in=new Scanner(System.in);
        System.out.println("enter l/w/d");
        int l=in.nextInt(),w=in.nextInt(),d= in.nextInt();
        double pool_volume=l*w*d;
        double pool_capacity=l*w*d*CAPACITY;
        double time=(pool_capacity)/(RATE_OF_FLOW*60);
        System.out.println(time);



    }
}
