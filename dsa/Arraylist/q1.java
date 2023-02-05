package com.adhithiya.dsa.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>();
        arr.add("red");
        arr.add("blue");
        arr.add("green");
        System.out.println(arr);
        arr.set(0,"yellow");
        System.out.println(arr);
        arr.add(1,"sky");
        System.out.println(arr);
        System.out.println(arr.get(2));
        arr.remove(3);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
