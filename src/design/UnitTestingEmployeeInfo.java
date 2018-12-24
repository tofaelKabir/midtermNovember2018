package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        EmployeeInfo emp1 = new EmployeeInfo("Dennis S. Charney", 2154565);
        emp1.setSalary(130000);
        Assert.assertEquals(130000.0,emp1.getSalary());
//need to add and fix

    }
}
