package homework;
/*
3）小时工类，实现员工接口
属性：
工作的小时，每小时工资。
方法：
1. 设置工作的小时
2. 设置每小时的工资。
3. 重写计算工资方法：
小时工没有基本工资，他的工资就是工作的小时*每小时工资。
 */
public class HourEmployee implements Employee {
    private String name;
    private int hour;
    private int hour_salary;

    public HourEmployee(String name, int hour, int hour_salary) {
        this.name = name;
        this.hour = hour;
        this.hour_salary = hour_salary;
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

    public int getHour_salary() {
        return hour_salary;
    }

    public void setHour_salary(int hour_salary) {
        this.hour_salary = hour_salary;
    }

    @Override
    public String toString() {
        return "HourEmployee{" +
                "name='" + name + '\'' +
                ", hour=" + hour +
                ", hour_salary=" + hour_salary +
                '}';
    }

    @Override
    public double Getsalary() {
        return hour * hour_salary;
    }

    @Override
    public String GetName() {
        return name;
    }
}
