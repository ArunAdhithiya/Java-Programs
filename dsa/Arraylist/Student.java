package com.adhithiya.dsa.Arraylist;

public class Student {
    String name;
    int rno;
    double cgpa;
    String dob;
    Student()
    {
        this.name=null;
        this.rno=-1;
        this.cgpa=-1;
        this.dob=null;
    }
    void setDetails(String name,int rno,double cgpa,String dob)
    {
        System.out.println("name:"+name);
        System.out.println("rno:"+rno);
        System.out.println("cgpa:"+cgpa);
        System.out.println("dob:"+dob);
    }

}
