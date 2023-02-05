package com.adhithiya.lab4;

import java.util.Scanner;

public class billing {
        double price,quantity;
        Scanner in = new Scanner(System.in);
        double tax = 0.08;
        double total = 0;
        double computeBill(double price)
        {
            total = price + tax;
            return total;
        }
        double computeBill(double price,double quantity)
        {
            total= (price*quantity)+tax;
            return total;
        }
        double computeBill(double price,double quantity,double coupon)
        {
            total=(price*quantity)-coupon;
            total+=tax;
            return total;
        }

}
