package com.adhithiya.dsa.Arraylist;

public class Main {
    public static void main(String[] args) {
        Student[] obj=new Student[5];
        for(int i=0;i<5;i++)
        {
            obj[i]=new Student();
        }
        obj[0].setDetails("arun",1,12,"12/2/2003");
        obj[1].setDetails("adhi",2,13,"13/2/2001");
        obj[2].setDetails("akash",14,1,"12/1/2003");
        obj[3].setDetails("karn",16,2,"3/3/2003");
        obj[4].setDetails("karan",12,2,"18/9/2002");
    }
}
