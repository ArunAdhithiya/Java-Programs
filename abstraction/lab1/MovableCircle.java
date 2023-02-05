package com.adhithiya.abstraction.lab1;


class MoveableCircle implements Movable{
    private int radius;
    movablePoint center;
    MoveableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        x=center.x;
        y=center.y;
        xSpeed=center.xSpeed;
        ySpeed=center.ySpeed;
        this.radius=radius;
    }
    public void moveUp(){
        center.y+=center.ySpeed;
        System.out.println("x and y after moveup"+"("+center.x+","+center.y+")");
    }
    public void moveDown(){ center.y-=center.ySpeed;
        System.out.println("x and y after movedown"+"("+center.x+","+center.y+")");
    }
    public void moveLeft(){
        center.x-=center.xSpeed;
        System.out.println("x and y after moveleft"+"("+center.x+","+center.y+")");
    }
    public void moveRight(){
        center.x+=center.xSpeed;
        System.out.println("x and y after moveright"+"("+center.x+","+center.y+")");
    }
    public String toString(){
        String s="";
        s+="("+center.x+","+center.y+")";
        return s;
    }
}