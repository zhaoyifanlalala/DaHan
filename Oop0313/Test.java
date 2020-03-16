package homework;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        Employee hourWorkerA = new HourEmployee("小明",200,10);
        Employee hourWorkerB = new HourEmployee("小红",230,10);
        Employee salesManA = new SalesMan("销售A",5000,2000);
        Employee salesManB = new SalesMan("销售B",200000,3000);
        Employee OrdinaryEmployee = new OrdinaryEmployee("普通员工",205,5000);
        //Employee OrdinaryEmployee2 = new OrdinaryEmployee("删除",300,3000);
        Employee JewelryWorker = new JewelryWorker("首饰工人",30);
        Employee[] employees = {hourWorkerA,hourWorkerB,salesManA,salesManB,OrdinaryEmployee,JewelryWorker};
        company.setEmployee(employees);
        //company.deleteEmployee("删除");
        company.showSalary("销售B");
        System.out.println(company.GetAllSalary());
    }
}


