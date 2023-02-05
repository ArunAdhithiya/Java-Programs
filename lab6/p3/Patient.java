package com.adhithiya.lab6.p3;

import com.adhithiya.lab6.p1.Person;

public class Patient extends Person{
    int patientId;
    public Patient(String name,int age,int rno,int patientId)
    {
        super(name,age,rno);
        this.patientId=patientId;
    }
    public void patientDetails()
    {
        System.out.println("patientname:"+name);
        System.out.println("patientage:"+age);
        System.out.println("patientrno:"+rno);
        System.out.println("patientid:"+patientId);
    }
}
