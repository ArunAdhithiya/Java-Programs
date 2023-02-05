package com.adhithiya.lab3;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        int sum;
        int[] t=new int[5];
        int[] p=new int[5];
        int i;
        for(i=0;i<5;i++)
        {
            Scanner in=new Scanner(System.in);
            System.out.println("enter theory marks of student["+i+"]");
            t[i]+=in.nextInt();
            System.out.println("enter practical marks of student["+i+"]");
            p[i]+=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            sum=0;
            sum+=t[i]+p[i];
            if(sum>=40){
                if(t[i]>15 && p[i]>15)
                    System.out.println("student["+i+"] passed");
                else
                    System.out.println("student["+i+"] failed in one component");
            }
            else
                System.out.println("student["+i+"] failed in overall");
        }

    }
}
