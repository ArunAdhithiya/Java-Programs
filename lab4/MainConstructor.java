package com.adhithiya.lab4;

public class MainConstructor {
    public static void main(String[] args) {
        constructor o=new constructor();
        constructor o1=new constructor(3,20,3);
        System.out.println(o.getId());
        System.out.println(o.getAge());
        System.out.println(o.getBlood());
        System.out.println(o1.getId());
        System.out.println(o1.getAge());
        System.out.println(o1.getBlood());


    }
}
