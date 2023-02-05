package com.adhithiya.abstraction.lab1;

public class TestProgram {
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("fluffy");
        Animal a=new Fish("goldy");
        Animal e=new Spider();
        Pet p=new Cat();

        d.eat();
        System.out.println(d.getName());
        d.setName("kango");
        d.play();
        d.walk();

        c.eat();
        System.out.println(c.getName());
        c.setName("jerry");
        c.play();

        System.out.println(p.getName());
        a.walk();
        a.eat();
        e.walk();
        e.eat();


    }
}
