package com.banyuan.homework1;
/*
线程安全的懒汉模式
 */
public class LazySafe {
    private static LazySafe lazySafe=null;

    private  LazySafe(){

    }
    public static LazySafe getInstance() {
        if (lazySafe == null) {
            synchronized (LazyDemo.class) {
                if (lazySafe == null) {
                    lazySafe = new LazySafe();
                }
            }
        }
        return lazySafe;
    }
}

class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println(LazySafe.getInstance().hashCode());
    }
}
class Test2{
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        MyThread1 myThread2=new MyThread1();
        myThread1.start();
        myThread2.start();
    }
}
