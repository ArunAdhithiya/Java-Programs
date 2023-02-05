package com.adhithiya.files;

import java.io.*;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) throws MyException,IOException {
        try
        {
            Scanner in=new Scanner(System.in);
            System.out.println("item no:");
            String n=in.next();
            System.out.println("quantity");
            String n1=in.next();
            String[] arr={"101","105","108","115","125"};
            String[] arr2={"100.5","175.95","220.45","280.75","300.99"};
            int f1=0;
            for(int i=0;i<5;i++)
            {
                if(arr[i].equals(n))
                {
                    System.out.println("valid file created");
                    f1=1;
                    File f=new File("C:\\Users\\Adhithiya\\Documents\\Java\\abc1.txt");
                    f.createNewFile();
                    FileWriter out=new FileWriter("C:\\Users\\Adhithiya\\Documents\\Java\\abc1.txt");
                    out.write(n+" ");
                    out.write(n1+" ");
                    out.write(arr2[i]+" ");
                    out.close();
                }
            }
            if(f1!=1){
                System.out.println("invalid");
                throw new MyException();
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
