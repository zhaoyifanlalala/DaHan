package com.banyuan.homework1;
/*
懒汉模式
 */
public class LazyDemo {
    private static LazyDemo lazyDemo=null;

    private  LazyDemo(){

    }

    public static LazyDemo getInstance() {
        lazyDemo = new LazyDemo();
        return lazyDemo;
    }

}

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(LazyDemo.getInstance().hashCode());
    }
}
class Test1{
    public static void main(String[] args) {
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        myThread1.start();
        myThread2.start();
    }
}
