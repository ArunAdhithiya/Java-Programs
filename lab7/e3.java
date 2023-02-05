package com.adhithiya.lab7;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) throws Exception {
        try{
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("enter 1(+)/2(-)/3(*)/4(/)");
        int c = in.nextInt();
            if (c == 1) {
                System.out.println("add:" + (a + b));
            } else if (c == 2) {
                System.out.println("sub:" + (a - b));
            } else if (c == 3) {
                System.out.println("mul:" + (a * b));
            } else if (c == 4) {
                System.out.println("div:" + (a / b));
            }
            else
            {
               throw new Exception();
            }
        }
        catch(Exception e){
            System.out.println("exception caught: enter correct input");
        }
    }
}
