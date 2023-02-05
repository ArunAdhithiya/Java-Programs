package com.adhithiya.files;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        try {
            System.out.println("limit:");
            int a = in.nextInt();
            String str = "";
            String st = "";
            for (int i = 0; i < a; i++) {
                System.out.println("enter values:");
                char c = in.next().charAt(0);
                st += c;
            }
            System.out.println("before uppercase:" + st);
                str += st.toUpperCase();
                System.out.println("after :" + str);

                FileWriter f=new FileWriter("C:\\Users\\Adhithiya\\Documents\\Java\\abc.txt");
                f.write(str);
                f.close();
            System.out.println("file is written");
        }
        catch(Exception e){
                System.out.println(e);
            }
    }
}
