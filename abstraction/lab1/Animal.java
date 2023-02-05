package com.adhithiya.abstraction.lab1;

public abstract class Animal {
    protected int legs;
    Animal(int legs)
    {
        this.legs=legs;
    }
    abstract void eat();
    void walk()
    {
        System.out.println("animal walks with "+legs+"legs");
    }
}
