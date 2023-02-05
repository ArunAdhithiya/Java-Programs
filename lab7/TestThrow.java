package com.adhithiya.lab7;

public class TestThrow {

    public void validate(int age) {
        if(age<18)
            throw new ArithmeticException( "not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) throws Exception {
        TestThrow T = new TestThrow();
        T.validate(1);
        System.out.println("rest of the code...");
    }

}
