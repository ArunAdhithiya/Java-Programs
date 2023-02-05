package com.adhithiya.lab3;

import java.util.Scanner;

public class coinArray {
    public static void main(String[] args) {
        String [] arr=new String[8];
        int i;
        Scanner in=new Scanner(System.in);
        for(i=0;i<8;i++)
        {
            arr[i]=in.next();
        }
        for(i=0;i<=arr.length-1;i++)
        {
            if((i+1)%2==0&& (i+1)%4!=0)
                System.out.println(arr[i]+" gets silver");
            if((i+1)%4==0 && (i+1)%2!=0)
                System.out.println(arr[i]+" gets gold");
            if((i+1)%2==0 && (i+1)%4==0)
                System.out.println(arr[i]+" gets gold");


        }
    }
}
