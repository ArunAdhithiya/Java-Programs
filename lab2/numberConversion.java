package com.adhithiya.lab2;

import java.util.Scanner;

public class numberConversion {
    public static void main(String[] args) {
        int rev,sum=0;
        System.out.println("enter the number: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>0)
        {
            rev=n%10;
            sum=(sum*10)+rev;
            n/=10;
        }
        String str="";
        while(sum>0)
        {
            rev=sum%10;
            if(rev==0)
                str+="ZERO ";
            else if(rev==1)
                str+="ONE ";
            else if(rev==2)
                str+="TWO ";
            else if(rev==3)
                str+="THREE ";
            else if(rev==4)
                str+="FOUR ";
            else if(rev==5)
                str+="FIVE ";
            else if(rev==6)
                str+="SIX ";
            else if(rev==7)
                str+="SEVEN ";
            else if(rev==8)
                str+="EIGHT ";
            else if(rev==9)
                str+="NINE ";
            sum/=10;
        }
        System.out.println(str);
    }
}
