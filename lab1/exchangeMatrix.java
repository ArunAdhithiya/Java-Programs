package com.adhithiya.lab1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class exchangeMatrix {
    public static void main(String[] args) {
        int r=0,c=0,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the row");
        r=in.nextInt();
        System.out.println("enter the col");
        c=in.nextInt();
        int [][] arr=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("original matrix: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("after swapping ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(" "+arr[j][i]);
            }
            System.out.println(" ");
        }



    }
}
