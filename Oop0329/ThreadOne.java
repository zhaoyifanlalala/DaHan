package com.banyuan.homework;
/*
1.现在有三个线程,如何保持三个线程按照顺序执行
 */
public class ThreadOne implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread1");

    }
}

class ThreadTwo implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread2");
    }
}
class ThreadThree implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread3");
    }
}

class Test{
    public static void main(String[] args) {
        ThreadOne threadOne=new ThreadOne();
        ThreadTwo threadTwo=new ThreadTwo();
        ThreadThree threadThree=new ThreadThree();
        Thread t1=new Thread(threadOne);
        Thread t2=new Thread(threadTwo);
        Thread t3=new Thread(threadThree);
        t1.start();
        t2.start();
        t3.start();

    }
}