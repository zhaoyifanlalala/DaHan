package cn.jicheng;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("小明",true,22,"中国");
        person.work();
        person.eat();
        person.sleep();
        Worker worker = new Worker("半圆",3);
        worker.work();
        StudentLeader stu = new StudentLeader("小明",true,22,"中国","清华大学",001,"网络工程师");
        stu.meeting();
    }
}
