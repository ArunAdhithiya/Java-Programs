package com.adhithiya.lab7;

import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(a + b);
                break;
            } catch (Exception e) {
                System.out.println("enter two integers");
                in.nextLine();
            }
        }
    }
}
