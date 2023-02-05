package com.adhithiya.inheritence2;

//https://github.com/hariketsheth/CSE1007--Java-Programming/blob/main/Labs/LAB%203%20-%20HARIKET%20SUKESH%20KUMAR%20SHETH%20-%2020BCE1975.pdf

public class MainEmployee {
    public static void main(String[] args) {
        projectManager o1=new projectManager(1,1,1,"arun","robotics",2000);
        sysEngineer o2=new sysEngineer(1,"adhithiya","ml",2000);
        thAssistent o3=new thAssistent("tom","mis",2000);
        o1.computeSalary();
        o2.computeSalary();
        o3.computeSalary();
    }
}
