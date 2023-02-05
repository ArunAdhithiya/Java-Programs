package com.adhithiya.inheritence1;
import java.lang.*;

public class Member {
    String name;
    String address;
    int age,pno,salary;
    Member(String name,String address,int age,int pno,int salary)
    {
        this.name=name;
        this.address=address;
        this.age=age;
        this.pno=pno;
        this.salary=salary;
    }
    void printSalary()
    {
        System.out.println("salary: "+this.salary);
    }

}
