package com.adhithiya.abstraction.lab1;

public class movablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    movablePoint(int x,int y,int xSpeed,int ySpeed)
    {

        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveLeft() {
        x-=xSpeed;
        System.out.println("after moveleft x and y:");
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
        System.out.println("after moveright x and y:");
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
        System.out.println("after moveup x and y:");
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
        System.out.println("after movedown x and y:");
    }

    public String toString()
    {
        return (x+"/"+y);
    }
}
