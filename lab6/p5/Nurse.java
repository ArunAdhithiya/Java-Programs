package com.adhithiya.lab6.p5;

import com.adhithiya.lab6.p2.Staff;

public class Nurse extends Staff {

    String work;
    public Nurse(String name,int age,int rno,int staffId,String work)
    {
        super(name,age,rno,staffId);
        this.work=work;
    }
    public void nurseDetails()
    {
        System.out.println("nursename:"+name);
        System.out.println("nurseage:"+age);
        System.out.println("nurserno:"+rno);
        System.out.println("nurseid:"+staffId);
        System.out.println("nursework:"+work);
    }
}
