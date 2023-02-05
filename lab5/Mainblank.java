package com.adhithiya.lab5;

public class Mainblank {
    public static void main(String[] args) {
        electricBlank o1=new electricBlank();
        o1.setDetails("black","queen","wool",4,"yes");
        System.out.println(o1.toString());
        o1.setDetails("black","queen","wool",6,"no");
        System.out.println(o1.toString());
        o1.setDetails("black","invalid","wool",6,"no");
        System.out.println(o1.toString());


    }
}
