package com.adhithiya.dsa.basics;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // arr[i]=  -> arr.add()
        //arr[i] -> arr.get()
        //arr[i][j] = arr.get(i).add()
        //arr[i][j] = arr.get(i).get(j)
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr.get(i).add(in.nextInt());
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(arr.get(i).get(j));
            }
        }

    }

}
