package com.adhithiya.lab1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n,i,c=0,c1=0;
        System.out.println("enter the limit: ");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int[] arr= new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            if(arr[i]%2==0)
                c+=1;
            else
                c1+=1;
        }
        System.out.println("even: "+c);
        System.out.println("odd: "+c1);
    }
}
