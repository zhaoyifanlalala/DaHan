package homework;
/*
4）销售员工类，实现员工接口
属性：
销售的总金额
基本工资
方法
1. 设置销售的总金额
2. 重写计算工资方法：
基本工资+提成。
提成的计算：
当销售额再10000 以下时，则提成10%，
等销售额再10000-100000之间是，则提成15%。
再 100000以上是，提成18%。
 */
public class SalesMan implements Employee {
    private String name;
    private double totalSalesAmount;
    private double basePay;

    public SalesMan() {
    }

    public SalesMan(String name, double totalSalesAmount, double basePay) {
        this.name = name;
        this.totalSalesAmount = totalSalesAmount;
        this.basePay = basePay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public void setTotalSalesAmount(double totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "name='" + name + '\'' +
                ", totalSalesAmount=" + totalSalesAmount +
                ", basePay=" + basePay +
                '}';
    }

    @Override
    public double Getsalary() {
        double royalties = 0;   //提成
        if (totalSalesAmount < 10000){
            royalties = totalSalesAmount * 0.1;
        }
        if(totalSalesAmount >= 10000 && totalSalesAmount <= 100000) {
            royalties = totalSalesAmount * 0.15;
        }
        if(totalSalesAmount > 100000){
            royalties = totalSalesAmount * 0.18;
        }
        return (royalties + basePay);
    }

    @Override
    public String GetName(){
        return name;
    }

}
