package com.adhithiya.lab4;

public class MainBill {
    public static void main(String[] args) {
        billing o=new billing();
        System.out.println(o.computeBill(20));
        System.out.println(o.computeBill(20,5));
        System.out.println(o.computeBill(20,5,3));

    }
}
