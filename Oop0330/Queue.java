package com.banyuan.homework1;
/*3.请使用LinkedList来模拟一个队列(先进先出的特性)
    3.1 拥有放入对象的方法void put(Object o)
    3.2 取出对象的方法Object get()
    3.3 判断队列当中是否为空的方法booleanisEmpty()；并且，编写测试代码，验证你的队列是否正确？
 */
import java.util.LinkedList;

public class Queue {
    private LinkedList<Object> linkedList = new LinkedList<>();

    public void put(Object o) {
        linkedList.add(o);
    }

    public Object get() {
        return linkedList.get(0);
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
class TestQueue{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.put(111);
        q.put(112);
        q.put(113);
        q.put(114);
        q.put(115);
        System.out.println(q.toString());

    }
}
