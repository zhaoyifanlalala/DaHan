package com.banyuan.homework1;

import java.util.HashSet;
import java.util.Objects;

/*
1.在HashSet集合中添加三个Person对象，把姓名相同的人当做同一个人，禁止重复添加
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
class PersonTest{
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        Person person1=new Person("张三",22);
        Person person2=new Person("张三",27);
        Person person3=new Person("王五",18);
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        for (Object obj:hashSet) {
            Person person=(Person)obj;
            System.out.println(person.getName()+":"+person.getAge());
        }
    }
}
