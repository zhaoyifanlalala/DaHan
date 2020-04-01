package com.banyuan.homework1check.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("请上台发言！");
        Object obj=method.invoke(object,args);
        System.out.println("请大家鼓掌！");
        return obj;
    }
}
