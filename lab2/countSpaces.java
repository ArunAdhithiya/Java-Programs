package com.adhithiya.lab2;

import java.util.Scanner;

public class countSpaces {
    public static void main(String[] args) {
        int c=0,i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the quote:");
        String s=in.nextLine();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==32)
                c+=1;
            else
                continue;
        }
        System.out.println("quote: "+c);

    }
}
