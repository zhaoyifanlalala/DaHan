package com.banyuan.thread;

public class ThreadJavaTest {
    public static void main(String[] args) {
        ThreadJava2 threadJava2=new ThreadJava2();
        Thread t1=new Thread(threadJava2,"张三1");
        Thread t2=new Thread(threadJava2,"张三2");
        Thread t3=new Thread(threadJava2,"张三3");
        Thread t4=new Thread(threadJava2,"张三4");
        Thread t5=new Thread(threadJava2,"张三5");
        Thread t6=new Thread(threadJava2,"张三6");
        Thread t7=new Thread(threadJava2,"张三7");
        Thread t8=new Thread(threadJava2,"张三8");
        Thread t9=new Thread(threadJava2,"张三9");
        Thread t10=new Thread(threadJava2,"张三10");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();


    }
}
