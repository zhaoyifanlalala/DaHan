package Collection3;
/*
2.试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
 */
public class TestQuestion {
    private  int testId;
    private String testName;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String Answers;

    public TestQuestion() {
    }

    public TestQuestion(int testId, String testName, String choiceA, String choiceB, String choiceC, String choiceD) {
        this.testId = testId;
        this.testName = testName;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
    }

    public TestQuestion(int testId, String testName, String choiceA, String choiceB, String choiceC, String choiceD, String answers) {
        this.testId = testId;
        this.testName = testName;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
        Answers = answers;
    }

    public  int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
    }

    public String getAnswers() {
        return Answers;
    }

    public void setAnswers(String answers) {
        Answers = answers;
    }

    @Override
    public String toString() {
        return "TestQuestion{" +
                "testId=" + testId +
                ", testName='" + testName + '\'' +
                ", choiceA='" + choiceA + '\'' +
                ", choiceB='" + choiceB + '\'' +
                ", choiceC='" + choiceC + '\'' +
                ", choiceD='" + choiceD + '\'' +
                ", Answers='" + Answers + '\'' +
                '}';
    }
}
