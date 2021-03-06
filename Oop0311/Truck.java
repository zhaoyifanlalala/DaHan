package cn.jicheng;
/*
设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight
小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
卡车类Truck是Car类的子类，其中包含的属性有载重量payload。
每个类都有构造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能
 */

public class Truck extends Car {
    private double payload;
    public Truck(){

    }

    public Truck(double payload) {
        this.payload = payload;
    }

    public Truck(int loader, double payload) {
        super(loader);
        this.payload = payload;
    }

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
    public void show() {
        System.out.println("轮子有"+this.getWheels()+"个，"+"车重"+this.getWeight()+"t，"+"载客人数有"+this.getLoader()+"人，"+"载重量为"+this.payload+"t");
    }
}
