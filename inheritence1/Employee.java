package com.adhithiya.inheritence1;

public class Employee extends Member {
    String specialization;
    Employee(String specialization,String name,String address,int age,int pno,int salary)
    {
        super(name,address,age,pno,salary);
        this.specialization=specialization;
    }
    void employeeDetails()
    {
        System.out.println("specialization:"+this.specialization);
        System.out.println("address:"+this.address );
        System.out.println("age:"+this.age);
        System.out.println("pno:"+this.pno);
        super.printSalary();
        System.out.println("name:"+this.name);
    }
}
