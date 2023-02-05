package com.adhithiya.lab5;

public class blank {
    double price;
    String color,material,size;
    blank()
    {
        this.size="twin";
        this.color="white";
        this.price=30;
        this.material="cotton";
    }

    void setDetails(String color,String size,String material)
    {
        this.material=material;
        this.size=size;
        this.color=color;
        if(this.size=="double")
            this.price+=10;
        else if(this.size=="queen")
            this.price+=25;
        else if(this.size=="king")
            this.price+=40;
        else if(this.material=="wool")
            this.price+=25;
        else if(this.material=="cashmere")
            this.price+=45;
        if(size=="invalid" || material=="invalid"){
            size="Twin";
            color="white";
            material="cotton";
            price=30;
        }
    }
    public String toString()
    {
        return (material+"-"+size+"-"+this.price+"-"+color);
    }

}
