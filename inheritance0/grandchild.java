package com.adhithiya.inheritance0;

public class grandchild extends child{
    void printGrandChild()
    {
        super.printParent();
        super.printChild();
        System.out.println("iam grandchild");
    }
}
