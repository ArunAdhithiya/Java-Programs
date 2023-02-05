package com.adhithiya.lab1;

import java.util.Arrays;
import java.util.Scanner;


public class Avg2 {
    public static void main(String[] args) {
        int sum=0,n,i,sum1=0;
        System.out.println("enter the limit");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int [] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(i=1;i<n-1;i++)
        {
            sum1+=arr[i];
        }
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum after :"+sum1);
        System.out.println("sum before :"+sum);
        System.out.println("avg:"+(float)sum1/(n-2));
    }
}
