package com.adhithiya.threads;

class Table {
    protected static long k;

    synchronized void print(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" counter value:"+Table.k);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            k++;
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.print();
    }
}

class Hello {
    public static void main(String[] args) {
        Table obj=new Table();
        MyThread1 o1=new MyThread1(obj);
        MyThread1 o2=new MyThread1(obj);
        o1.start();
        o2.start();
        try{
            o1.join();
            o2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(Table.k);

    }
}