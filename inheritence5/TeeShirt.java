package com.adhithiya.inheritence5;

public class TeeShirt {
    double order,price;
    String size,color;
    void setTeeShirtDetails(String size,String color,int order)
    {
        this.size=size;
        this.color=color;
        this.order=order;
    }
    String getTeeShirtDetails()
    {
        if(size=="XXL"||size=="XXXL")
            price=22.99;
        else
            price=19.99;
        return ("size:"+size+" color:"+color+" orderno:"+order+" price:"+price);
    }
}
