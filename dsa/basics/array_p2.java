package com.adhithiya.dsa.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class array_p2 {
    public static void main(String[] args) {
        ArrayList<Character>arr=new ArrayList<>();
        arr.add('a');
        arr.add('b');
        arr.add('n');
        arr.add('z');
        int f=0,q=0;
        while(true)
        {
            Scanner in=new Scanner(System.in);
            System.out.println("enter character:");
            char a=in.next().charAt(0);
            if(arr.contains(a))
            {
                System.out.println("guessed corectly");
                q++;
                f++;
            }
            if(f==arr.size()) {
                System.out.println("guessed in "+q+" tries");
                break;
            }
            else if(!arr.contains(a)) {
                System.out.println("guessed wrongly");
                q++;
            }
        }
    }
}
