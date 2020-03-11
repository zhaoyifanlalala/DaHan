package cn.oop;
/*
现有
学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
试题类（试题编号number,试题内容title,试题选项 anwserA  anwserB anwserC anwserD  试题答案  Anwser）
要求:
其中一个学生（有6个）登录账号进行考试,在控制台随机显示10个题目,并且输入题目的正确答案才会有分数,
每题10分,现在有30个题目(题目自己出,不做要求)。
求学生考完试在控制台最终得到的分数
 */
public class Students {
    private String stuNum;
    private String stuName;
    private String stuGrade;
    private double stuScore;

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }

    public String getStuNum() {
        return stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public double getStuScore() {
        return stuScore;
    }

    @Override
    public String toString() {
        return "Students{" +
                "stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuGrade='" + stuGrade + '\'' +
                ", stuScore=" + stuScore +
                '}';
    }
}
