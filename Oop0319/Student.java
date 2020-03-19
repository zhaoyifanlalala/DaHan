package Collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
1.模拟在校学生选课系统,使用集合完成
要求：1.学生类:学号，姓名，所选课程Set<Course>
学生可以对课程做增删改查操作
 */
public class Student {
    private String stuname;
    private int stuid;
    private Set<Course> courses;

    public Student() {
    }

    public Student(String stuname, int stuid, Set<Course> courses) {
        this.stuname = stuname;
        this.stuid = stuid;
        this.courses = courses;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuname='" + stuname + '\'' +
                ", stuid=" + stuid +
                ", courses=" + courses +
                '}';
    }
    public void insertCourse(Course course){
        this.courses.add(course);
    }
}
