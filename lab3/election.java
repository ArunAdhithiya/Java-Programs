package com.adhithiya.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class election {
    public static void main(String[] args)
    {
        int[] count = new int[5];
        int spoilt = 0;
        int i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("limit:");
        int n=in.nextInt();
        for(i=0;i<n;i++)
        {
            int a=in.nextInt();
            if(a==1)
                count[0]+=1;
            else if(a==2)
                count[1]+=1;
            else if(a==3)
                count[2]+=1;
            else if(a==4)
                count[3]+=1;
            else if(a==5)
                count[4]+=1;
            else
                spoilt+=1;
        }
        System.out.println(Arrays.toString(count));
        System.out.println(spoilt);

    }
}
