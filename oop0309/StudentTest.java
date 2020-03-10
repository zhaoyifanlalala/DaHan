package cn.face;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < stu.length; i++) {
            Student  st=new Student();
            System.out.println("请输入第"+(i+1)+"个学生的姓名:");
            st.setStuName(sc.next());
            System.out.println("请输入第"+(i+1)+"个学生的成绩:");
            double math=sc.nextDouble();
            st.setMath(math);
            double eng=sc.nextDouble();
            st.setEnglish(eng);
            double ch=sc.nextDouble();
            st.setChinese(ch);
            double science=sc.nextDouble();
            st.setScience(science);
            stu[i]=st;
        }

        //得到平均分最高
        int  index=0;
        double   max=stu[0].getAvgScore();
        for (int i = 1; i < stu.length; i++) {
            if(max<stu[i].getAvgScore()){
                max=stu[i].getAvgScore();
                index=i;
            }
        }
        System.out.println("平均分最大值的人所有的信息如下:"+stu[index].toString());
    }
}
