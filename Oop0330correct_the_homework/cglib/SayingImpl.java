package com.banyuan.homework1check.cglib;

import com.banyuan.homework1check.jdk.Saying;

public class SayingImpl implements Saying {
    @Override
    public void sayHello(String name) {
        System.out.println(name+"大家好");
    }

    @Override
    public void talking(String name) {
        System.out.println(name+":我的愿望是世界和平");
    }
}
