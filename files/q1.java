package com.adhithiya.files;

import java.io.*;
import java.io.IOException;

public class q1 {
    public static void main(String[] args) throws IOException {
        try
        {
            File f=new File("C:\\Users\\Adhithiya\\Documents\\Java\\abc.txt");
            f.createNewFile();
            if(f.exists())
                System.out.println("file exists");
            else
                System.out.println("created now");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
