package com.adhithiya.inheritence5;

public class CustomTee extends TeeShirt{
    String slogan;
    void setCustomTeeDetails(String size,String color,int order,String slogan)
    {
        super.setTeeShirtDetails(size,color,order);
        this.slogan=slogan;
    }
    String getCustomTeeDetails()
    {
        if(size=="XXL"||size=="XXXL")
            price=22.99;
        else
            price=19.99;
        return ("size:"+size+" color:"+color+" orderno:"+order+" price:"+price+" slogan:"+slogan);
    }
}
