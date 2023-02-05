package com.adhithiya.dsa.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String>arr1=new ArrayList<>();
        ArrayList<String>arr2=new ArrayList<>();
        ArrayList<String>arr3=new ArrayList<>();

        arr1.add("a");
        arr1.add("b");

        arr2.add("z");
        arr2.add("m");
        arr2.add("x");

        int len=Math.min(arr1.size(), arr2.size());
        for(int i=0;i<len;i++)
        {
            arr3.add(arr1.get(i));
            arr3.add(arr2.get(i));
        }

    }
}
