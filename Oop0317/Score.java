package home;
/*
1.编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。
如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
 */
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("请输入您的分数:");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                throw new ScoreException("分数必须在0—100之间");
            }else {
                System.out.println("成绩为：" + score);
            }
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
class ScoreException extends Exception {
    public ScoreException() {
        super();
    }
    public ScoreException(String message) {
        super(message);
    }
}