package com.adhithiya.lab6.p4;

import com.adhithiya.lab6.p2.Staff;

public class Doctor extends Staff {

    String department;
    public Doctor(String name,int age,int rno,int staffId,String department)
    {
        super(name,age,rno,staffId);
        this.department=department;
    }
    public void doctorDetails()
    {
        System.out.println("doctorname:"+name);
        System.out.println("doctorage:"+age);
        System.out.println("doctorrno:"+rno);
        System.out.println("doctorid:"+staffId);
        System.out.println("doctordepartment:"+department);
    }
}
