package com.banyuan.homework1check.jdk;


import java.lang.reflect.Proxy;

public class TestJdkProxy {
    public static void main(String[] args) {
        Saying saying=new SayingImpl();
        MyInvocationHandler handler = new MyInvocationHandler(saying);

        Saying proxy=(Saying) Proxy.newProxyInstance(saying.getClass().getClassLoader(),
                new Class<?>[] { Saying.class }  ,handler);
        proxy.sayHello("Jack");
        proxy.talking("Rose");

    }
}
