package com.adhithiya.lab3;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=7;
        int c=3;
        int i,j;
        int[][] arr=new int[r][c];
        String [] product={"Pa","Pb","Pc"};
        String [] day={"d1","d2","d3","d4","d5","d6","d7"};
        int [] unit_price=new int[3];
        for(i=0;i<3;i++)
        {

            System.out.println("unit["+i+"]");
            unit_price[i]=in.nextInt();
        }
        for(i=0;i<7;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("units["+i+"]["+j+"]");
                arr[i][j]=in.nextInt();
            }
        }
        for(i=0;i<7;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        for(i=0;i<7;i++)
        {
            int sum=0;
            for(j=0;j<3;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("day["+i+"]:"+sum);
        }
        for(i=0;i<7;i++)
        {
            int total=0;
            for(j=0;j<3;j++)
            {
                total+=unit_price[j]*arr[i][j];
            }
            System.out.println("total:"+total);
        }
        int t1=0,t2=0,t3=0;
        for(i=0;i<3;i++)
        {
            t1+=arr[i][0];
            t2+=arr[i][1];
            t3+=arr[i][2];
        }
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
