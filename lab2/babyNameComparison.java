package com.adhithiya.lab2;

import java.util.Scanner;

public class babyNameComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names ={null,null,null};

        System.out.println("Please enter the names:");

        for(int x=0; x<=2;x++)
            names[x]= input.nextLine();

        System.out.println(names[0] + " " + names[1]);
        System.out.println(names[1] + " " + names[2]);
        System.out.println(names[0] + " " + names[2]);
    }
}
