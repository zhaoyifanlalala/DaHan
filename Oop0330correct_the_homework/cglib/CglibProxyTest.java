package com.banyuan.homework1check.cglib;

public class CglibProxyTest {
    public static void main(String[] args) {
        CglibDemo proxy=new CglibDemo();
//        CglibProxyTest proxy=new CglibProxyTest();
        Saying s=(Saying)proxy.getProxy(SayingImpl.class);
        s.sayHello("Jack");
        s.talking("Rose");
    }
}
