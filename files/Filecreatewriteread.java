package com.adhithiya.files;

import java.io.*;
import java.util.Scanner;

public class Filecreatewriteread {
    public static void main(String[] args) {
        try
        {
            File f=new File("C:\\Users\\Adhithiya\\Documents\\Java\\test.txt");
            f.createNewFile();// file created
            FileWriter out=new FileWriter("C:\\Users\\Adhithiya\\Documents\\Java\\test.txt");//write in file
            Scanner in=new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                System.out.println("enter values:");
                out.write(in.nextLine()); // write input values on file
            }
            out.close();
            FileReader fr=new FileReader("C:\\Users\\Adhithiya\\Documents\\Java\\test.txt");
            Scanner dri=new Scanner(fr);
            String c;

            fr.close();
        }
        catch(Exception e){
            System.out.println("error occur:"+e);
        }
    }
}
