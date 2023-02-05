package com.adhithiya.inheritence1;

public class Manager extends Member{
    String department;
    Manager(String department,String name,String address,int age,int pno,int salary)
    {
        super(name,address,age,pno,salary);
        this.department=department;
    }
    void managerDetails()
    {
        System.out.println("department:"+this.department);
        System.out.println("address:"+this.address );
        System.out.println("age:"+this.age);
        System.out.println("pno:"+this.pno);
        super.printSalary();
        System.out.println("name:"+this.name);
    }
}
