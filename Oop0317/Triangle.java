package home;
/*
2.写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，
如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数， 调用此方法，并捕获异常。
 */
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入边长a：");
        int a=sc.nextInt();
        System.out.println("输入边长b：");
        int b=sc.nextInt();
        System.out.println("输入边长c：");
        int c=sc.nextInt();
        isTriangle(a,b,c);
    }
    public static void isTriangle(int a, int b, int c) {
        try {
            if((a+b)>c && (a+c)>b && (b+c)>a) {
                System.out.println("边长a："+a+",边长b："+b+",边长c："+c);
            }else {
                throw new IllegalArgumentException("a,b,c不能构成三角形");
            }
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
