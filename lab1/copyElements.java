package com.adhithiya.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class copyElements {
    public static void main(String[] args) {
        int i;
        int [] arr=new int[5];
        int [] arr1=new int[5];
        Scanner in=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            arr[i]+=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            arr1[i]+=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
    }
}
