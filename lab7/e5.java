package com.adhithiya.lab7;

import java.util.Arrays;
import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[100];
            Scanner in = new Scanner(System.in);
            int i;
            for (i = 0; i < 100; i++) {
                arr[i] = (int) (Math.random() * 100 + 1);// Math.random()*(max+min+1)+min
            }
            System.out.println("enter index:");
            int a = in.nextInt();
            System.out.println(arr[a]);
        }
        catch(Exception e){
            System.out.println("out of bound");
        }
    }
}
