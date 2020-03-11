package cn.jicheng;

public class Student extends Person {
    private String school;
    private int stuNumber;

    public Student(){}

    public Student(String school, int stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student(String name, boolean gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学习");
    }
}
