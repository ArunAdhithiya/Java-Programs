package com.adhithiya.lab6.p2;

import com.adhithiya.lab6.p1.Person;

public class Staff extends Person {
    protected int staffId;
    public Staff(String name1,int age1,int rno1,int staffId)
    {
        super(name1,age1,rno1);
        this.staffId=staffId;
    }
    public void staffDetails()
    {
        System.out.println("staffname:"+name);
        System.out.println("staffage:"+age);
        System.out.println("staffrno:"+rno);
        System.out.println("staffid:"+staffId);
    }
}
