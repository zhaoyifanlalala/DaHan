package cn.face;

public class Student {
    double chinese;
    double math;
    double english;
    double allscience;
    String sname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getAllscience() {
        return allscience;
    }

    public void setAllscience(double science) {
        this.allscience = allscience;
    }

    public double avgScore(){
        return ((getChinese() + getEnglish() + getMath() + getAllscience()) / 4.0);
    }
}
