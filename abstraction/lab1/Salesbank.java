package com.adhithiya.abstraction.lab1;

public class Salesbank implements bank {
    int balance,interest;
    String bank;
    @Override
    public void setDetails(int balance, String bank, int interest) {
        this.balance=balance;
        this.bank=bank;
        this.interest=interest;
        int a=balance+interest;
        System.out.println(balance);
        System.out.println(bank);
        System.out.println(interest);
        System.out.println(a);
    }

}
