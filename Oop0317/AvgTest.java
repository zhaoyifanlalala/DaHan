package home;

import java.util.Scanner;

/*
3.编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，如何必须输入所有N个数。
如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正数或者0”。
并提示用户再次输入该数
 */
public class AvgTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("需要求的N个数的平均数：");
        int n = sc.nextInt();
        System.out.println("你需要输入" + n + "个数：");
        int a;
        double sum = 0;
        // 循环输入数
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            try {
                a = sc.nextInt();
                // 判断是否小于0
                if (a < 0) {
                    // 小于就抛异常
                    throw new IllegalArgumentException();
                }
                sum += a;
            } catch (IllegalArgumentException e) {// 捕获异常
                System.err.println("N必须是正数或者0,请重新输入该数");
                e.printStackTrace();
                i -= 1;
            }
        }
        System.out.println("平均数是：" + sum / n);
    }
}
