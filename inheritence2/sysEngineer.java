package com.adhithiya.inheritence2;

public class sysEngineer extends employee{
    int ta;
    sysEngineer(int ta,String name,String department,int salary)
    {
        super(name,department,salary);
        this.ta=ta;
    }
    void computeSalary()
    {
        System.out.println("sysEngineer:");
        int total=salary+ta;
        System.out.println("salary:"+total);
        System.out.println("name:"+this.name);
        System.out.println("department:"+this.department);

    }
}
