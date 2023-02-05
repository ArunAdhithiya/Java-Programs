package com.adhithiya.inheritence3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        methodOverloading o1=new methodOverloading();
        o1.computeCommission(in.nextDouble());
        o1.computeCommission(in.nextDouble(),in.nextInt());
        o1.computeCommission(in.nextDouble(),in.nextDouble());
    }
}
