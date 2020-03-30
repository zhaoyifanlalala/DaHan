package com.banyuan.homework1;
/*
饿汉模式
 */
public class SingleDemo {
    private static SingleDemo singleDemo=new SingleDemo();
    private SingleDemo(){
    }
    public static SingleDemo getInstance(){
        return singleDemo;
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(SingleDemo.getInstance().hashCode());
    }
}

class Test{
    public static void main(String[] args) {
        MyThread2 myThread1=new MyThread2();
        MyThread2 myThread2=new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}
