package com.adhithiya.lab7;

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        try {
            divide(a, b);
        }
        catch(Exception e){
            System.out.println("exception caught:"+e.getMessage());
        }


    }
    public static void divide(int x,int y)
    {
        System.out.println("result:"+ x/y);
    }
}
