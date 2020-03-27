package com.banyuan.thread;

public class MyThreadTest1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2=  new MyThread1();
        MyThread1 thread3=  new MyThread1();
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
