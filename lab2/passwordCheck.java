package com.adhithiya.lab2;

import java.util.Scanner;

public class passwordCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,f=0,x=0;
        String s=in.nextLine();
        for(i=0;i<s.length();i++)
        {
            if(s.length()>=8 && s.length()<=30){
                if((s.charAt(0)>=65 && s.charAt(0)<=90) ||(s.charAt(0)>=97 && s.charAt(0)<=122))
                {
                    if((s.charAt(i)>=65 && s.charAt(i)<=90) ||(s.charAt(i)>=97 && s.charAt(i)<=122)||(s.charAt(i)>47 && s.charAt(i)<=57)||s.charAt(i)==95){
                        f+=1;


                    }
                    else{
                        System.out.println("not other than digit or alphas");
                        x+=1;
                        break;
                    }
                }
                else {
                    System.out.println("invalid due to non alphabetic start ");
                    break;
                }
            }
            else {
                System.out.println("invalid password");
                break;
            }

        }
        if(f>0 && x<1)
            System.out.println("valid password");
    }
}
