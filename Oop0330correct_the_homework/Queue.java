package com.banyuan.homework1check;

import java.util.LinkedList;

public class Queue {

private LinkedList<Object> linkedList = new LinkedList<>();

    public void put(Object o) {
        linkedList.add(o);
    }

    public Object get() {
        Object temp = linkedList.getFirst();
        linkedList.removeFirst();
        return temp;
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "linkedList=" + linkedList +
                '}';
    }
}
class TestQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.put(111);
        q.put(112);
        q.put(113);
        q.put(114);
        q.put(115);
        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q.isEmpty());

    }
}
