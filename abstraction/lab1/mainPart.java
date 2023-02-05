package com.adhithiya.abstraction.lab1;

import java.util.Scanner;

public class mainPart {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("s1/s2/s3");
        double s1=in.nextDouble();
        double s2=in.nextDouble();
        double s3=in.nextDouble();
        Part o1=new Part(s1,s2,s3);
        o1.innerVolume();
        o1.outerVolume();
        o1.show();
    }
}
