package homework;

import java.util.Arrays;

/*
一个保存员工的数组。
方法：
1, 添加一个员工。
2,  通过员工的名字来删除员工。
3,  通过员工的名字来显示员工的工资。
4,  输出所有员工的工资和。
 */
public class Company {
    private Employee[] employee;

    public Company() {
    }

    public Company(Employee[] employee) {
        this.employee = employee;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    // 通过员工的名字来删除员工。
    public void deleteEmployee(String name){
        for (int i = 0; i < employee.length; i++){
            if(this.employee[i].GetName().equalsIgnoreCase(name)){
                this.employee[i] = employee[i];
            }
            this.employee = employee;
        }
    }
    // 通过员工的名字来显示员工的工资。
    public double showSalary(String name) {
        for (int i = 0; i < employee.length; i++) {
            if (this.employee[i].GetName().equalsIgnoreCase(name)) {
                return this.employee[i].Getsalary();
            }
        }
        return 0;
    }
    // 输出所有员工的工资和。
    public double GetAllSalary(){
        double allSalary = 0;
        for (int i = 0; i < employee.length; i++){
            allSalary += employee[i].Getsalary();
        }
        return allSalary;
    }


    @Override
    public String toString() {
        return "Company{" +
                "employee=" + Arrays.toString(employee) +
                '}';
    }
}

