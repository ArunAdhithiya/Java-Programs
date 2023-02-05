package com.adhithiya.inheritance0;

public class programmer extends employee{
    int bonus;
    programmer(float salary,int bonus)
    {
        super(salary);
        this.bonus=bonus;
    }
    void printSalary()
    {
        double total=salary+bonus;
        System.out.println("programmer salary:"+total);
    }
}
