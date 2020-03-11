package cn.jicheng;
/*
设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight
小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
卡车类Truck是Car类的子类，其中包含的属性有载重量payload。
每个类都有构造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能
 */

public class VehicleTest {
    public static void main(String[] args) {
        Truck truck=new Truck(4,2,5,20);
        truck.show();

    }
}
