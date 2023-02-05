package com.adhithiya.inheritence2;

public class projectManager extends employee{
    int agp,da,hra;
    projectManager(int agp,int da,int hra,String name,String department,int salary)
    {
        super(name,department,salary);
        this.agp=agp;
        this.hra=hra;
        this.da=da;
    }
    void computeSalary()
    {
        System.out.println("pmManager:");
        int total=hra+da+agp+salary;
        System.out.println("salary:"+total);
        System.out.println("department:"+this.department);
        System.out.println("name:"+this.name);
    }
}
