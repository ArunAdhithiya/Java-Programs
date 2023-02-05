package com.adhithiya.lab5;

public class electricBlank extends blank{
    int heat;
    String atm;
    electricBlank()
    {
        super();
        this.heat=1;
        this.atm="no";
    }
    void setDetails(String color,String size,String material,int heat,String atm)
    {
        super.setDetails(color,size,material);
        this.heat=heat;
        this.atm=atm;
        if(heat>5||heat<1)
            this.heat=1;
        if(atm=="yes")
            price+=5.75;
    }
    public String toString()
    {
        return (super.toString()+"/"+heat+"/"+atm);
    }

}
