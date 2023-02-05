package com.adhithiya.dsa.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class p1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=(in.nextInt());
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        int start=0,end=arr.length-1;
        while(start<end) {
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
