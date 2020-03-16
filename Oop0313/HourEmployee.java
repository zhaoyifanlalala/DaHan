package homework;

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
    public double salary() {
        return hour * hour_salary;
    }
}
