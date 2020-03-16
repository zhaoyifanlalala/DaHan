package homework;
/*5）普通员工类，实现员工接口
        属性：
        工作的小时
        基本工资
        方法：
        1. 设置工作的小时
        2. 重写计算工资的方法：
        当每月工作的小时数超过196 小时时，超出的部分按每小时200 元。
        基本工资+（工作的小时-196）*200。*/
public class OrdinaryEmployee implements Employee{
    private String name;
    private int hour;
    private double basePay;

    public OrdinaryEmployee() {
    }

    public OrdinaryEmployee(String name, int hour, double basePay) {
        this.name = name;
        this.hour = hour;
        this.basePay = basePay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return "OrdinaryEmployee{" +
                "name='" + name + '\'' +
                ", hour=" + hour +
                ", basePay=" + basePay +
                '}';
    }

    @Override
    public double Getsalary() {
        double overTimePay = 0;
        if(hour > 196){
            overTimePay = (hour - 196) * 200;
        }
        return (overTimePay + basePay);

    }

    @Override
    public String GetName() {
        return name;
    }
}
