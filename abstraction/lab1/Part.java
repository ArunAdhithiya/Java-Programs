package com.adhithiya.abstraction.lab1;

public class Part implements volume{
    double s1,s2,s3;
    double innervolume,outervolume;
    Part(double s1,double s2,double s3)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    @Override
    public void innerVolume() {
        innervolume=(1/3.0)*Math.PI*s1*s2*s3;
    }

    @Override
    public void outerVolume() {
        outervolume=(4/3.0)*Math.PI*s1*s2*s3;
    }
    void show()
    {
        System.out.println(innervolume);
        System.out.println(outervolume);
    }
}
