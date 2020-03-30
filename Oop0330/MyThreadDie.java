package com.banyuan.homework1;

public class MyThreadDie extends Thread{
    private  boolean  flag;
    public MyThreadDie(String name,boolean  flag) {
        super(name);
        this.flag=flag;
    }
    @Override
    public synchronized void run() {
        if(flag){
            System.out.println(Thread.currentThread().getName()+"拿到了刀..");
            System.out.println(Thread.currentThread().getName()+"拿到了叉...");
        }else {
            System.out.println(Thread.currentThread().getName()+"拿到了叉...");
            System.out.println(Thread.currentThread().getName()+"拿到了刀...");
        }
    }
}
class  TestDieLock{
    public static void main(String[] args) {
        MyThreadDie  myThread1=new MyThreadDie("person1",true);
        MyThreadDie  myThread2=new MyThreadDie("person2",false);
        myThread1.start();
        myThread2.start();
    }
}
class DieLock {
    static final Object  dao=new Object();
    static final Object  cha=new Object();
}