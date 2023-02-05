package com.adhithiya.lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    int i,j;
    int[][] arr=new int[3][3];
    int[][] arr1=new int[3][3];
    int[][] sum=new int[3][3];
    int[][] sub=new int[3][3];
    void getDetails()
    {
        Scanner in=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("arr["+i+"]["+j+"]");
                arr[i][j]=in.nextInt();

            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("arr1["+i+"]["+j+"]");
                arr1[i][j]=in.nextInt();
            }
        }


    }
     void printDetails()
    {
        System.out.println("arr:");
        for(i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("arr1:");
        for(i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
    void add()
    {
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("sum:");
        for(i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(sum[i]));
        }
    }
    void sub()
    {
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sub[i][j]=arr[i][j]-arr1[i][j];
            }
        }
        System.out.println("sub:");
        for(i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(sub[i]));
        }
    }
}
