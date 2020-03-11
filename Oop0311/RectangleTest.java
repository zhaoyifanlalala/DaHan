package cn.jicheng;
/*
1.按要求编写一个Java应用程序：
（1）定义一个类，描述一个矩形，包含有长、宽两种属性，和计算面积方法。
（2）编写一个类，继承自矩形类，同时该类描述长方体，具有长、宽、高属性，和计算体积的方法。
（3）编写一个测试类，对以上两个类进行测试，创建一个长方体，定义其长、宽、高，输出其底面积和体积
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle2 rectangle2=new Rectangle2();
        rectangle2.setrLong(5.0);
        rectangle2.setrWidth(10.0);
        rectangle2.setrHigh(2.0);

        System.out.println("长方体底面积为"+rectangle2.area()+"cm");
        System.out.println("长方体体积为"+rectangle2.volume()+"cm");
    }
}
