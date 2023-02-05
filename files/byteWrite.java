package com.adhithiya.files;

import java.io.*;
import java.util.Scanner;

public class byteWrite {
    public static void main(String[] args) throws IOException {
        try
        {
            FileOutputStream out=new FileOutputStream("C:\\Users\\Adhithiya\\Documents\\Java\\abc2.txt");
            Scanner in=new Scanner(System.in);
            String s=in.nextLine();
            byte[] b=s.getBytes();
            out.write(b);
            out.close();
        }
        catch(Exception e){
            System.out.println("error"+e);
        }

    }
}
