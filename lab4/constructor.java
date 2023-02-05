package com.adhithiya.lab4;

public class constructor {
    int id,age,blood;
    constructor()
    {
        this.id=0;
        this.age=0;
        this.blood=0;
    }
    constructor(int id,int age,int blood)
    {
        this.id=id;
        this.age=age;
        this.blood=blood;
    }
    int getId()
    {
        return id;
    }
    int getAge()
    {
        return  age;
    }
    int getBlood()
    {
        return blood;
    }
}
