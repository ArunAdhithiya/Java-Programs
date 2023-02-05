package com.adhithiya.inheritence3;

// cat1= question paper problem
public class methodOverloading {
    double sales_amount;
    double c_rate;
    int co_rate;

    void computeCommission(double sales_amount,double c_rate)
    {
        double total= (sales_amount*c_rate);
        System.out.println("total1:"+total);
    }
    void computeCommission(double sales_amount,int co_rate)
    {
        double c=co_rate/100.0;
        double total2=(sales_amount*c);
        System.out.println("total2:"+total2);
    }
    void computeCommission(double sales_amount)
    {
        double d=(0.75)*c_rate;
        System.out.println("c_rate:"+d);
        System.out.println("sales:"+sales_amount);
    }


}
