package cn.jicheng;
/*
设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight
小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
卡车类Truck是Car类的子类，其中包含的属性有载重量payload。
每个类都有构造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能
 */
public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle() {

    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
    public void show() {
        System.out.println("轮子有"+wheels+"个，"+"车重"+weight+"t");
    }
}
