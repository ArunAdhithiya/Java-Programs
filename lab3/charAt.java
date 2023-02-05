package com.adhithiya.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class charAt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int arr[]=new int[str.length()];
        int i;
        int b=2,c=1;
        arr[0]=(int)str.charAt(0);
        for(i=1;i<str.length();i++)
        {;
            c=b*c;
            arr[i]+=c*(int)str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
