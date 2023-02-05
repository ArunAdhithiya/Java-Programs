package com.adhithiya.lab1;

import java.util.Scanner;

public class distancePoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x1");
        double x1=in.nextDouble();
        System.out.println("x2");
        double x2=in.nextDouble();
        System.out.println("y1");
        double y1=in.nextDouble();
        System.out.println("y2");
        double y2=in.nextDouble();
        double a= Math.pow(x2-x1,2);
        double b= Math.pow(y2-y1,2);
        double c= Math.sqrt(a+b);
        System.out.println(c);
    }
}
