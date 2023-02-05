package com.adhithiya.lab1;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int num,rev=0,rem=0,sum=0,n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter num:");
        num=in.nextInt();
        while(num!=0)
        {
            rev=num%10;
            sum=(sum)+rev;
            num/=10;
        }
        System.out.println(sum);
    }
}
