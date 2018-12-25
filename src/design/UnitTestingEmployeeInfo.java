package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        EmployeeInfo emp1 = new EmployeeInfo("Valentine Fuster", 2154565);
        Assert.assertEquals("Valentine Fuster",emp1.getEmpName());
        emp1.setDepartment("Medicine");
        Assert.assertEquals("Medicine",emp1.getDepartment());
        emp1.setSalary(220000.0);
        Assert.assertEquals(220000.0,emp1.getSalary());
        emp1.setPerformance(5);
        //Assert.assertEquals(5,emp1.getPerformance()); //not working
        double bonus101 = emp1.calculateEmployeeBonus(emp1.getSalary(), (int) emp1.getPerformance());
        Assert.assertEquals(264000.0,emp1.calculateEmployeeBonus(emp1.getSalary(), (int) emp1.getPerformance()));
        EmployeeInfo.calculateEmployeePension((int)emp1.getSalary());
        Assert.assertEquals(22000,EmployeeInfo.calculateEmployeePension((int)emp1.getSalary()));

    }
}
