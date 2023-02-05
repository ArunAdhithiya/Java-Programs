package com.adhithiya.lab5;

import java.util.Scanner;

public class MainPlayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []arr=new int[10];
        smashPlayer o2=new smashPlayer();
        o2.setId(12);
        o2.setName("arun");
        System.out.println(o2.getId());
        System.out.println(o2.getName());
        int i;
        System.out.println("lvl");
        int lvl=in.nextInt();
        o2.setArr(arr,lvl);
        System.out.println("payment:");
        double pay=in.nextDouble();
        premiumPlayer o1=new premiumPlayer();
        o1.setlvl(pay,lvl);

    }
}
