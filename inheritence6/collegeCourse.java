package com.adhithiya.inheritence6;

import java.util.Scanner;

public class collegeCourse {
    protected String department;
    protected int no;
    protected int credit,fee;
    Scanner in=new Scanner(System.in);
    collegeCourse()
    {
        System.out.println("no/credit/department");
        this.no=in.nextInt();
        this.credit=in.nextInt();
        this.department=in.next();
        fee=120*credit;
    }

    void display()
    {
        System.out.println("no:"+this.no);
        System.out.println("credit:"+this.credit);
        System.out.println("department:"+this.department);
        System.out.println("fee:"+fee);

    }

}
