package com.adhithiya.lab2;

import java.util.Scanner;

public class stringOperations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("first name:");
        String a=in.nextLine();
        System.out.println("second name:");
        String b=in.nextLine();
        System.out.println("strings are: "+a+" ."+b);
        System.out.println("first name length: "+a.length());
        System.out.println("second name length: "+b.length());
        System.out.println("concat: "+a.concat(b));
        System.out.println("first character: "+a.charAt(0));
        System.out.println("uppercase: "+a.toUpperCase());
        System.out.println("lowercase: "+a.toLowerCase());
        System.out.println("enter index character: ");
        char n=in.nextLine().charAt(0);
        System.out.println("index: "+a.indexOf(n));
        System.out.println("substring: "+b.substring(2,6));
        System.out.println("replace:"+a.replace('n','a'));
        System.out.println("equal: "+a.equals(b)+" \nequalIgnoreCase: "+a.equalsIgnoreCase(b));



    }
}
