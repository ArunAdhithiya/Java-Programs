package com.adhithiya.inheritence5;

public class DemoTees {
    public static void main(String[] args) {
        TeeShirt o1=new TeeShirt();
        TeeShirt o2=new TeeShirt();
        CustomTee o3=new CustomTee();
        CustomTee o4=new CustomTee();
        o1.setTeeShirtDetails("XXL","blue",12);
        o2.setTeeShirtDetails("XL","red",10);
        System.out.println(o1.getTeeShirtDetails());
        System.out.println(o2.getTeeShirtDetails());
        o3.setCustomTeeDetails("XXXL","orange",100,"awesome_man");
        o4.setCustomTeeDetails("XXL","pink",102,"cool");
        System.out.println(o3.getCustomTeeDetails());
        System.out.println(o4.getCustomTeeDetails());
    }
}
