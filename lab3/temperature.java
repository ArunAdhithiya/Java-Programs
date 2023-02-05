package com.adhithiya.lab3;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        int [][] arr=new int[5][5];
        Scanner in=new Scanner(System.in);
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.println("arr["+i+"]["+j+"]");
                arr[i][j]=in.nextInt();
            }
        }
        int max=arr[0][0];
        int temp1=0,temp2=0;
        String [] arr1=new String[5];
        for(i=0;i<5;i++)
        {
            System.out.println("enter city["+i+"]");
            arr1[i]=in.next();
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                    temp1=i;
                    temp2=j;
                }
            }
        }
        System.out.println("city:"+arr1[temp1]+"day:"+(temp2+1)+"max:"+arr[temp1][temp2]);
        int min=arr[0][0];
        int t1=0,t2=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                    t1=i;
                    t2=j;
                }
            }
        }
        System.out.println("city::"+arr1[t1]+"day:"+(t2+1)+"min:"+arr[t1][t2]);


    }
}
