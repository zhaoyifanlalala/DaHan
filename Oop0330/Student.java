package com.banyuan.homework1;

import java.util.*;

/*
2.选择合适的Map集合保存5位学员的学号和姓名，然后按学号的自然顺序的倒序将这些键值对一一打印出来
 */
public class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
class StudentTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"学生1");
        map.put(2,"学生2");
        map.put(3,"学生3");
        map.put(4,"学生4");
        map.put(5,"学生5");
        Set set = map.keySet();
        for (Object obj:set) {
            //System.out.println(obj);
            //System.out.println(map.get(obj));
            System.out.println("学号"+obj+":"+map.get(obj));
        }
    }
}
