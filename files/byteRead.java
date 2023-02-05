package com.adhithiya.files;

import java.io.FileInputStream;
import java.io.IOException;

public class byteRead {
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream in=new FileInputStream("C:\\Users\\Adhithiya\\Documents\\Java\\abc2.txt");
            int c;
            while((c=in.read())!=-1){
                System.out.println((char)c);
            }
            in.close();
        }
        catch(Exception e){
            System.out.println("error"+e);
        }

    }
}
