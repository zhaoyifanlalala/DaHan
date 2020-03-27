package com.banyuan.thread;

import java.util.Random;

/*
1.有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称
 */
public class MyThread1 extends Thread {
    private int count=200;
    Object   obj=new Object();
    @Override
    public void run() {                    //用三个线程控制台显示出来的数字有重复的
                                           //而且程序运行到结尾不结束
        while(true){
            synchronized (obj){
                if (count<400&&count%2==1){
                    System.out.println((count++)+"----"+Thread.currentThread().getName());
                }else {
                    count++;
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

