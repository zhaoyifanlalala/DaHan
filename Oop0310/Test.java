package cn.oop;

public class Test {
    private double number;
    private String title;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String answer;

    public double getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Test{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", answerA='" + answerA + '\'' +
                ", answerB='" + answerB + '\'' +
                ", answerC='" + answerC + '\'' +
                ", answerD='" + answerD + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
