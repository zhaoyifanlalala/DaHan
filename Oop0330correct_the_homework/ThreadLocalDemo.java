package com.banyuan.homework1check;
/*
ThreadLocal学习以及案例上传

initialValue函数 : initialValue函数用来设置ThreadLocal的初始值,该函数在调用get函数的时候会第一次调用，但是如果一开始就调用了set函数，则该函数不会被调用。
get函数：该函数用来获取与当前线程关联的ThreadLocal的值，如果当前线程没有该ThreadLocal的值，则调用initialValue函数获取初始值返回。
set函数： set函数用来设置当前线程的该ThreadLocal的值。
remove函数：remove函数用来将当前线程的ThreadLocal绑定的值删除。

 */
public class ThreadLocalDemo {
    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    static class MyThread extends Thread{

        private int index;

        public MyThread(int index){
            this.index = index;
        }

        public void run(){
            System.out.println("线程"+index+":的初始value="+value.get());
            for (int i = 0; i < 10; i++) {
                value.set(value.get()+i);
                if(i == 5){
                    value.remove();
                }
            }
            System.out.println("线程"+index+":的累加始value="+value.get());
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread(i)).start();
        }
    }
}
