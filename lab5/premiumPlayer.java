package com.adhithiya.lab5;

public class premiumPlayer extends smashPlayer{
    double pay;
    void setlvl(double pay,int lvl)
    {

        if(pay>=2.99) {
            lvl += 40;
            System.out.println("total lvl u can play:" + lvl);
        }
        else{
            System.out.println("pay somemore");
        }

    }

}
