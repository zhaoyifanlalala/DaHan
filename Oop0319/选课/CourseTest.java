package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
3.学生选课清单类
完成:有n个人 显示出每个人所选的课程信息
如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等
 */
public class CourseTest {
    public static void main(String[] args) {
        Set<Course> courses = new HashSet<>();
//        Course course=new Course("java基础",9527);
//        Course course1=new Course("C#",9768);
//        Course course2=new Course("javaScript",9898);
        courses.add(new Course("java基础",9527));
        courses.add(new Course("C#",9768));
        courses.add(new Course("javaScript",9898));
        Student student=new Student("张三",1,courses);
        //Student student2=new Student("张三2",2,courses);
        System.out.println(student);
    }
}
