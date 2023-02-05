package com.adhithiya.inheritence1;

/*
    https://github.com/hariketsheth/CSE1007--Java-Programming/blob/main/Labs/LAB%203%20-%20HARIKET%20SUKESH%20KUMAR%20SHETH%20-%2020BCE1975.pdf
 */
public class MainMember {
    public static void main(String[] args) {
        Employee o1=new Employee("robotics","arun","chennai",18,999,20000);
        Manager o2=new Manager("scope","adhithiya","pondy",20,777,30000);
        System.out.println("employee:");
        o1.employeeDetails();
        System.out.println("manager:");
        o2.managerDetails();
    }
}

