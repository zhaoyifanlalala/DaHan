package com.banyuan.thread;
/*
2.现在有一个旅行队10个人,探险进入一线天,这个一线天每次只能过一个人,
  每个人过的时间是20秒,现在10个人通过该一线天,请输出每个人经过一线天的顺序和姓名
 */
public class ThreadJava2 implements Runnable {

    @Override                      //不知道对不对
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
