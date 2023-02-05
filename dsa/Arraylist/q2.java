package com.adhithiya.dsa.Arraylist;

public class q2 {
    public static void main(String[] args) {
        String str="mississippi";
        String s1="";
        if(str.charAt(0)!=str.charAt(1))
        {
            s1+=str.charAt(0);
        }
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)!=str.charAt(i+1))
            {
                s1+=str.charAt(i+1);
            }
        }
        System.out.println(s1);
    }
}
