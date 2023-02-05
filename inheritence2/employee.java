package com.adhithiya.inheritence2;

public class employee {
    String name,department;
    int salary;
    employee(String name,String department,int salary)
    {
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    void computeSalary()
    {
        System.out.println("basic pay:"+this.salary);
    }
}
