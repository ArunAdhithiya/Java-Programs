package com.adhithiya.dsa.basics;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class basicMain {
    public static void main(String[] args) {

        Stack<Integer> arr = new Stack<>();
        arr.push(20);
        arr.push(10);
        arr.push(2);
        int len=arr.size();
        //System.out.println(arr.peek());//top of the stack
        arr.remove(2);
        System.out.println(arr);
        }
        /*
        LinkedList<String>arr1=new LinkedList<>();
        arr1.add("asj");
        arr1.add("alsk");
        arr1.add("mshnd");
        for(int i=0;i<arr1.size();i++)
        {
            System.out.println(arr1.get(i));
        }

        Queue<String> arr2=new LinkedList<>();
        arr2.add("there");
        arr2.add("is");
        arr2.add("dsa");
        int len2=arr2.size();
        for(int i=0;i<len;i++)
        {
            System.out.println(arr2.remove());
        }

        HashMap<Integer,String> arr3=new HashMap<>();
        arr3.put(1,"ayush");
        arr3.put(2,"maxi");
        arr3.put(3,"kadi");
        arr3.put(3,"arun");
        int len5=arr3.size();
        for(int i=0;i<=len5;i++)
        System.out.println(arr3.get(i));
*/
    }

