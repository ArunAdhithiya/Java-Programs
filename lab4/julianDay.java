package com.adhithiya.lab4;

import java.util.Scanner;

public class julianDay {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("julianday:");
        int a=in.nextInt();
        int day=(a+1)%7;
        if(day==0) {
            System.out.println("day:" + day);
            System.out.println("sunday");
        }
        if(day==1) {
            System.out.println("day:" + day);
            System.out.println("monday");
        }
        if(day==2) {
            System.out.println("day:" + day);
            System.out.println("tuesday");
        }
        if(day==3) {
            System.out.println("day:" + day);
            System.out.println("wednesday");
        }
        if(day==4) {
            System.out.println("day:" + day);
            System.out.println("thursday");
        }
        if(day==5) {
            System.out.println("day:" + day);
            System.out.println("friday");
        }
        if(day==6) {
            System.out.println("day:" + day);
            System.out.println("saturday");
        }


    }
}
