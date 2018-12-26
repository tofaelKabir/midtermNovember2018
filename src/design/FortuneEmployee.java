package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo info = new EmployeeInfo();
		info.hospitalEstablished();
		info.hospitalDescription();

		EmployeeInfo ceo = new EmployeeInfo(1209164, "Kenneth L. Davis","Psychology",40000,'M',true,5);
		info.startUpBonus();
		Employee.housing(); //static method can be called by Interface directly without instantiating it
		info.healthInsurance();

		EmployeeBethIsrael.bethIsraelInfo(); //static method can be called by class or interface directly without instantiating it

		EmployeeBethIsrael eBI = new EmployeeBethIsrael();
		eBI.setMonthlySalary(22000);
		eBI.getMonthlySalary();
		eBI.setPerformance(4);
		System.out.println("His Yearly bonus $:"+eBI.calculateEmployeeYearlyBonus(eBI.getMonthlySalary(), (int) eBI.getPerformance())+"\n");
		System.out.println("\nNow The calculation for Pension:\n");


		EmployeeInfo emp1 = new EmployeeInfo("Valentine Fuster", 2154565);
		emp1.setDepartment("Medicine");
		emp1.setMonthlySalary(22000);
		emp1.calculateYearlySalary();
		emp1.setPerformance(5);
		double bonus101 = emp1.calculateEmployeeYearlyBonus(emp1.getMonthlySalary(), (int) emp1.getPerformance());
		emp1.calculateEmployeeMonthlyPension((int)emp1.getMonthlySalary());

		EmployeeInfo emp2 = new EmployeeInfo("Mohammad Sharkar", 2188458);
		emp2.setDepartment("Cardiology");
		emp2.setMonthlySalary(5000);
		emp2.calculateYearlySalary();
		emp2.getMonthlySalary();
		emp2.setPerformance(4);
		double bonus102 = emp2.calculateEmployeeYearlyBonus(emp2.getMonthlySalary(), (int) emp2.getPerformance());
		emp2.calculateEmployeeMonthlyPension((int)emp2.getMonthlySalary());

		EmployeeInfo emp3 = new EmployeeInfo("Pin Xu", 2347865);
		emp3.setDepartment("Genetics");
		emp3.setMonthlySalary(15000);
		emp3.calculateYearlySalary();
		emp3.getMonthlySalary();
		emp3.setPerformance(3);
		double bonus103 = emp3.calculateEmployeeYearlyBonus(emp3.getMonthlySalary(), (int) emp3.getPerformance());
		emp3.calculateEmployeeMonthlyPension((int)emp3.getMonthlySalary());


		List<Object> emp1Record = new ArrayList<Object>();
		emp1Record.add(emp1.getEmpName());
		emp1Record.add(emp1.getEmpID());
		emp1Record.add(emp1.getDepartment());
		emp1Record.add(emp1.calculateYearlySalary());
		emp1Record.add(bonus101);



		List<Object>emp2Record = new ArrayList<Object>();
		emp2Record.add(emp2.getEmpName());
		emp2Record.add(emp2.getEmpID());
		emp2Record.add(emp2.getDepartment());
		emp2Record.add(emp2.calculateYearlySalary());
		emp2Record.add(bonus102);


		List<Object>emp3Record = new ArrayList<Object>();
		emp3Record.add(emp3.getEmpName());
		emp3Record.add(emp3.getEmpID());
		emp3Record.add(emp3.getDepartment());
		emp3Record.add(emp3.calculateYearlySalary());
		emp3Record.add(bonus103);


		Map<Integer, List<Object>> empInfo = new HashMap<Integer, List<Object>>();
		empInfo.put(101,emp1Record);
		empInfo.put(102,emp2Record);
		empInfo.put(103,emp3Record);
		for(Map.Entry<Integer, List<Object>> value : empInfo.entrySet()) {
				System.out.println(value.getKey() + "----->" + value.getValue());

		}


	}
}


