package cn.jicheng;
/*
设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight
小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
卡车类Truck是Car类的子类，其中包含的属性有载重量payload。
每个类都有构造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能
 */

public class Car extends Vehicle {
    private int loader;

    public Car(){

    }
    public Car(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                '}';
    }
    public void show() {
        System.out.println("轮子有"+this.getWheels()+"个，"+"车重"+this.getWeight()+"t"+"载客人数有"+this.loader+"人");
    }
}
