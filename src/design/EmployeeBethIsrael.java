package design;

//Inheritance
public class EmployeeBethIsrael extends EmployeeInfo{

    public EmployeeBethIsrael(){
        super(2312345,"Jeremy Boal",true); //only one constructor either default or parameterized, can be called by super from Parents class
        super.benefitLayout(); //super can call it's parent's original method as well as it's inherited method from Interface and Abstract class.
        super.healthInsurance();
    }

    public static void bethIsraelInfo(){
        System.out.println("Beth Israel: A 799-bed teaching hospital founded in 1889 on Manhattan’s Lower East Side\n");
    }
    public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
        int total=0;
        return total;
    }
    //overloading
    public static double calculateEmployeeBonus(double salary, int performance) {

        double yearlyBonus = 0;
        if (performance == 5) {
            yearlyBonus = salary * 0.15 * 12;
        } else if (performance == 4) {
            yearlyBonus = salary * 0.10 * 12;
        } else if (performance == 3) {
            yearlyBonus = salary * 0.08 * 12;
        } else if (performance == 2) {
            yearlyBonus = salary * 0.04 * 12;
            System.out.println("Your performance is poor, improve your performance.");
        } else if (performance == 1){
            yearlyBonus = 0;
            System.out.println("You are fired.");
        }
        return yearlyBonus;
    }
}

//EmployeeInfo - superClass
//EmployeeBethIsrael, EmployeeStLuke - - subClass
//EmployeeInfo - - superClass,
//EmployeeInfo - EmployeeBethIsrael - - Single inheritance
//EmployeeInfo - EmployeeBethIsrael - EmployeeUrgentCareUpperWestSide - - Multilevel inheritance
//EmployeeInfo - EmployeeBethIsrael, EmployeeInfo - EmployeeStLuke - - hierearchical inheritance