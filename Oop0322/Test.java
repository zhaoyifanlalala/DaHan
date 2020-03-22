package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
3.现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
现在有一个学生进行考试,请在控制台输出这个学生的考试成绩
 */
public class Test {
    private Scanner sc = new Scanner(System.in);
    private static List<Student> list1=new ArrayList<Student>();
    private List<TestQuestion> list2=new ArrayList<TestQuestion>();

    private void addStudent() {
        Student stu = new Student(1,"张三",1234);
        list1.add(stu);
        Student stu2 = new Student(2,"李四",123);
        list1.add(stu2);
    }
    private void addTestQuention() {
        TestQuestion question1 = new TestQuestion(1,"问题1","A","B","C","D","A");
        list2.add(question1);
        TestQuestion question2 = new TestQuestion(question1.getTestId()+1,"问题2","A","B","C","D","A");
        list2.add(question2);
        TestQuestion question3 = new TestQuestion(question2.getTestId()+1,"问题3","A","B","C","D","A");
        list2.add(question3);
        TestQuestion question4 = new TestQuestion(question3.getTestId()+1,"问题4","A","B","C","D","A");
        list2.add(question4);
        TestQuestion question5 = new TestQuestion(question4.getTestId()+1,"问题5","A","B","C","D","A");
        list2.add(question5);
    }
    private void exam(){
        System.out.println("输入学号：");
        int stuId = sc.nextInt();
        System.out.println("输入密码：");
        int stuPwd = sc.nextInt();
        for (Student stu : list1) {
            if (stu.getStuId()==stuId && stu.getStuPwd()==stuPwd){
                System.out.println("学号为："+stu.getStuId()+",姓名为："+stu.getStuName()+"的同学"+",请开始作答");
                for (TestQuestion test:list2) {
                    System.out.println(test.toString());
                    System.out.println("你的答案：");
                    String answer = sc.next();
                    System.out.println();
                    if (test.getAnswers().equals(answer)) {
                        stu.setStuScore(stu.getStuScore() + 10);
                    }
                }
                System.out.println("答题完毕！请停笔");
                System.out.println(stu.toString());
            }else {
                System.out.println("输入错误，请重新输入");
            }
        }

    }
    public static void main(String[] args) {
        Test test = new Test();
        test.addStudent();
        test.addTestQuention();
        test.exam();
        for (Student stu:list1) {
            System.out.println(stu.toString());
        }
    }


}
