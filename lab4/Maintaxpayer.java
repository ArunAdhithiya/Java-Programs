package com.adhithiya.lab4;

import java.util.Scanner;

public class Maintaxpayer {
    public static void main(String[] args) {
        taxPayer[] obj=new taxPayer[5];
        Scanner in= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("ygi");
            int b= in.nextInt();
            obj[i]=new taxPayer(b);
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(obj[i].getSsn());
            System.out.println(obj[i].getYgi());
        }
    }
}
