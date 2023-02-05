package com.adhithiya.lab4;

public class shirt {
    int size,length;
    shirt(int size,int length)
    {
        this.length=length;
        this.size=size;
    }
    String material="cotton";
    void method()
    {
        System.out.println(this.size);
        System.out.println(this.material);
        System.out.println(this.length);
    }
}
