package com.adhithiya.lab1;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        int sum=0,n;
        System.out.println("enter the limit");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println((float)sum/n);

    }
}
