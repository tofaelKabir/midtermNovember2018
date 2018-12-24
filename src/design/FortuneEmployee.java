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
		EmployeeInfo ceo = new EmployeeInfo(1209164, "Kenneth L. Davis","Psychology",480000,'M',true,5);
		info.startUpBonus();
		Employee.housing();
		info.healthInsurance();

		EmployeeInfo emp1 = new EmployeeInfo("Dennis S. Charney", 2154565);
		emp1.setDepartment("Medicine");
		emp1.setSalary(120000);
		//emp1.calculateSalary(emp1.getSalary());
		emp1.calculateSalary(emp1.getSalary());
		emp1.setPerformance(4);
		double bonus101 = emp1.calculateEmployeeBonus(emp1.getSalary(), (int) emp1.getPerformance());
		EmployeeInfo.calculateEmployeePension((int)emp1.getSalary());

		EmployeeInfo emp2 = new EmployeeInfo("Mohammad Sharkar", 2188458);
		emp2.setDepartment("Cardiology");
		emp2.setSalary(50000);
		emp2.calculateSalary(emp2.getSalary());
		emp2.setPerformance(3);
		double bonus102 = emp2.calculateEmployeeBonus(emp2.getSalary(), (int) emp2.getPerformance());
		EmployeeInfo.calculateEmployeePension((int)emp2.getSalary());

		EmployeeInfo emp3 = new EmployeeInfo("Pin Xu", 2347865);
		emp3.setDepartment("Genetics");
		emp3.setSalary(150000);
		emp3.calculateSalary(emp3.getSalary());
		emp3.setPerformance(3);
		double bonus103 = emp3.calculateEmployeeBonus(emp3.getSalary(), (int) emp3.getPerformance());
		EmployeeInfo.calculateEmployeePension((int)emp3.getSalary());


		List<Object>emp1Record = new ArrayList<Object>();
		emp1Record.add(emp1.getEmpName());
		emp1Record.add(emp1.calculateSalary(emp1.getSalary()));
		emp1Record.add(bonus101);



		List<Object>emp2Record = new ArrayList<Object>();
		emp2Record.add(emp2.getEmpName());
		emp2Record.add(emp2.calculateSalary(emp2.getSalary()));
		emp2Record.add(bonus102);


		List<Object>emp3Record = new ArrayList<Object>();
		emp3Record.add(emp3.getEmpName());
		emp3Record.add(emp3.calculateSalary(emp3.getSalary()));
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
