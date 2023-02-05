package com.adhithiya.abstraction.lab1;

public class Cat extends Animal implements Pet{
    String catName;
    String name;
    Cat(String catName)
    {
        super(4);
        this.catName=catName;
    }
    Cat()
    {
        this("");
    }

    @Override
    void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public String getName() {
        return catName;
    }

    @Override
    public String setName(String name) {
        this.name=name;
        return (catName);
    }

    @Override
    public void play() {
        System.out.println("cat is playing");
    }
}
