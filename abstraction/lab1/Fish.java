package com.adhithiya.abstraction.lab1;

public class Fish extends Animal implements Pet{
    String name;
    Fish(String name)
    {
        super(0);
        this.name=name;
    }
    Fish()
    {
        super(0);
        this.name="gold";
    }

    @Override
    void eat() {
        System.out.println("fish eats food");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        return name;
    }


    @Override
    public void play() {
        System.out.println("fish play");
    }
    public void walk()
    {
        System.out.println("fish cant walk");
    }
}
