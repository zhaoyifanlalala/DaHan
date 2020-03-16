package homework;
/*
7）随着该公司的业务扩展，该公司决定自己生产首饰，该公司多了一种新的类型的员工，
首饰工人。
定义首饰工人类，实现员工接口：
属性
生产首饰的数量
方法
1  设置生产首饰的数量
2  重写计算工资的方法
工资  ==  设置生产首饰的数量  *50；
 */
public class JewelryWorker implements Employee{
    private String name;
    private int number;

    public JewelryWorker() {

    }
    public JewelryWorker(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "JewelryWorker{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public double Getsalary() {
        return (number * 50);
    }
    @Override
    public String GetName() {
        return name;
    }
}
