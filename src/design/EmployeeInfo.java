package design;

import java.util.Scanner;

public class EmployeeInfo extends WhoWeAre implements Employee {
	
 /* Exception Handling is not used */

    static String companyName;

    private int empID;
	private String empName;
	private String department;
	private double monthlySalary; //need to fix, doesn't work
	private char sex;
	private boolean usaCitizen;
	private int performance;

	//default constructor
	public EmployeeInfo(){
	}
	//parameterized constructor created

	public EmployeeInfo(int empID, String empName, boolean usaCitizen) {
		this.empID = empID;
		this.empName = empName;
		this.usaCitizen = usaCitizen;
		System.out.println("Beth Israel's president's id :"+empID+", Name: "+empName+", USACitizen status: "+usaCitizen);
	}

	public EmployeeInfo(int empID, String empName, String department, double salary, char sex, boolean usaCitizen, int performance) {
		this.empID = empID;
		this.empName = empName;
		this.department = department;
		this.sex = sex;
		this.usaCitizen = usaCitizen;
		this.performance = performance;
		System.out.println("\nHospital's present CEO's id :"+empID+", Name: "+empName+". He is from: "+department+". His Salary is $: "+ monthlySalary +". His sex is: "+sex+", definitely USACitizen status: "+usaCitizen+". His performance rating is: "+performance);
	}

	//Getter setter method for encapsulation

	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getMonthlySalary() {

		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {

		this.monthlySalary = monthlySalary;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isUsaCitizen() {
		return usaCitizen;
	}
	public void setUsaCitizen(boolean usaCitizen) {
		this.usaCitizen = usaCitizen;
	}
	public float getPerformance() {
		return performance;
	}
	public void setPerformance(int performance) {
		this.performance = performance;
	}

    //EmployeeInfo class extends Abstract class method and implements methods of Interface below

	@Override
	public int employeeId() {
		return 0;
	}
	@Override
	public String employeeName() {
		return null;
	}
	@Override
	public void assignDepartment() {
	}
	@Override
	public int calculateYearlySalary()
	{int yearlySalary = (int) (12 * monthlySalary);
		return yearlySalary;
	}
	@Override
	public void benefitLayout() {
		System.out.println("Benefit for Mount Sinai Health System is the best among all the hospitals in NY");
	}
	@Override
	public void hospitalDescription() {
		System.out.println("Hospital's mission: "+mission+"\nHospital's vision: "+vision);
	}

	//additional method implemented
	public void healthInsurance(){
		System.out.println("All the employees get free health benefits without some exception\n");
	}
	//parameterized constructor (implemented)
	public EmployeeInfo(int employeeId){

		this.empID = employeeId;
	}
	public EmployeeInfo(String name, int employeeId){
		this.empName = name;
		this.empID = employeeId;
	}

	public double calculateSalary() {
		double salary = this.monthlySalary;
		double yearlySalary = salary * 12;
		return yearlySalary;
	}
	//Polymorphism is used
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}
	public static double calculateEmployeeBonus(double salary, int performance) {

		double yearlyBonus = 0;
		if (performance == 5) {
			yearlyBonus = salary * 0.1 * 12;
		} else if (performance == 4) {
			yearlyBonus = salary * 0.08 * 12;
		} else if (performance == 3) {
			yearlyBonus = salary * 0.06 * 12;
		} else if (performance == 2) {
			yearlyBonus = 0;
			System.out.println("Your performance is poor, improve your performance."); //how this is printing during pension calculation??
		} else if (performance == 1){
			yearlyBonus = 0;
			System.out.println("You are fired.");
		}
		return yearlyBonus;
	}

	public int calculateEmployeePension(double salary){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate= sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());

		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);

		//Calculate pension
		int numberOfYears = current - start;

		if (numberOfYears >= 5) {
			total = (int) (salary* .25);
		} else if (numberOfYears == 4) {
			total = (int) (salary * .20);
		} else if (numberOfYears == 3) {
			total = (int) (salary * .15);
		} else if (numberOfYears == 2) {
			total = (int) (salary * .10);
		} else if (numberOfYears == 1) {
			total = (int) (salary * .05);
		} else if (numberOfYears == 0) {
			total = 0;
		}
		System.out.println("Total pension: $" + total +"\n");

		return total;
	}

	private static class DateConversion { //nested class!

		public DateConversion(Months months){}

		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
