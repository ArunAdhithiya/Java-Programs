package com.adhithiya.inheritence2;

public class thAssistent extends employee {
    thAssistent(String name,String department,int salary)
    {
        super(name,department,salary);
    }
    void computeSalary(){
        System.out.println("thAsistant");
        super.computeSalary();
        System.out.println("department:"+this.department);
        System.out.println("name:"+this.name);
    }

}
