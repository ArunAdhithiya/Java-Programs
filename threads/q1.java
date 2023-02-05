package com.adhithiya.threads;

import java.util.Arrays;
import java.util.Scanner;

class Parent
{
    void display(){
        System.out.println("owns car");
    }
}

class Son extends Parent{
    void display1(){
        System.out.println("owns bike");
    }
}

class Grandson extends Son{
    void display2(){
        System.out.println("owns bus");
    }
}

class q1{
    public static void main(String[] args) {
        Grandson o1=new Grandson();
        o1.display();
        o1.display1();
        o1.display2();
    }
}