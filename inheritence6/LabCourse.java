package com.adhithiya.inheritence6;

public class LabCourse extends collegeCourse{
    int f=50;
    LabCourse(int no,int credit,String department)
    {
        this.no=no;
        this.credit=credit;
        this.department=department;
    }
    int total=f+super.fee;
    void display()
    {
        System.out.println("labcourse:");
        System.out.println("no:"+this.no);
        System.out.println("credit:"+this.credit);
        System.out.println("department:"+this.department);
        System.out.println("fee:"+total);

    }

}
