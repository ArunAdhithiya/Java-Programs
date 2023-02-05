package com.adhithiya.lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("enter values:");
            al.add(in.nextLine());
        }
        System.out.println(al);
        ArrayList<String>al1=new ArrayList<>();
        for(String i: al){
            String reverse="";
            int length = i.length();
            for ( int j = length - 1; j >= 0; j-- )
                reverse = reverse + i.charAt(j);
            if (i.equals(reverse))
                al1.add(i);
            else
                continue;
        }
        System.out.println(al1);

    }
}
