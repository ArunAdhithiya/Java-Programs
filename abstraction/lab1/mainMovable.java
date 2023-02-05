package com.adhithiya.abstraction.lab1;

import java.util.Scanner;

public class mainMovable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int xSpeed=in.nextInt();
        int ySpeed=in.nextInt();
        int r= in.nextInt();
        movablePoint o1=new movablePoint(x,y,xSpeed,ySpeed);
        o1.moveLeft();
        System.out.println(o1.toString());
        o1.moveRight();
        System.out.println(o1.toString());
        o1.moveUp();
        System.out.println(o1.toString());
        o1.moveDown();
        System.out.println(o1.toString());

        MoveableCircle mc=new MoveableCircle(x,y,xSpeed,ySpeed,r);
        mc.moveUp();
        mc.moveDown();
        mc.moveLeft();
        mc.moveRight();

    }
}
