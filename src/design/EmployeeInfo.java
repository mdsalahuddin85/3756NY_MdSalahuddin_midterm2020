package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployee implements Employee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	final String COMPANY_ADDRESS = "123 street";
	private String employeeName;
	private int employeeId;
	private String assignedDepartment;
	private static double salary;
	private char gender;
	private String dateOfBirth;
	private double performanceStar;

	public EmployeeInfo(String john_doe, int i, String hr, double v, char m) {
	}

	public EmployeeInfo() {

	}


	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		EmployeeInfo.salary = salary;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAssignedDepartment() {
		return assignedDepartment;
	}

	public void setAssignedDepartment(String assignedDepartment) {
		this.assignedDepartment = assignedDepartment;
	}

	public double getPerformanceStar() {
		return performanceStar;
	}

	public void setPerformanceStar(double performanceStar) {
		this.performanceStar = performanceStar;
	}


	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}

	public String getCOMPANY_ADDRESS() {
		return COMPANY_ADDRESS;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */



	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public void EmployeeInfo () {
	}


	public void EmployeeInfo ( int employeeId, String employeeName){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public void EmployeeInfo (String employeeName,int employeeId, String assignedDepartment,double salary,
							  char gender){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.assignedDepartment = assignedDepartment;
		this.salary = salary;
		this.gender = gender;
	}


	public void EmployeeInfo (String employeeName,int employeeId, String assignedDepartment,char gender, String
			dateOfBirth,double performanceStar){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.assignedDepartment = assignedDepartment;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.performanceStar = performanceStar;
	}


	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus ( double salary, double performanceStar){
		double total = 0;
		if (performanceStar == 5.0 && performanceStar > 4.5) {
			total += (salary * .10);
		} else if (performanceStar <= 4.5 && performanceStar > 4.0) {
			total += (salary * .08);
		} else if (performanceStar <= 4.0 && performanceStar > 3.6) {
			total += (salary * .70);
		} else if (performanceStar <= 3.6 && performanceStar > 3.2) {
			total += (salary * .50);
		} else {
			total += total;
		}

		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static double calculateEmployeePension () {
		double pensionAmount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);


		//implement numbers of year from above two dates
		//Calculate pension
		int numOfYearsWorked = current - start;
		if (numOfYearsWorked >= 10) {
			pensionAmount = salary * .30;
		} else if (numOfYearsWorked >= 5 && numOfYearsWorked < 10) {
			pensionAmount = salary * .25;
			;
		} else if (numOfYearsWorked == 4) {
			pensionAmount = salary * .20;
		} else if (numOfYearsWorked == 3) {
			pensionAmount = salary * .15;
		} else if (numOfYearsWorked == 2) {
			pensionAmount = salary * .10;
		} else if (numOfYearsWorked == 1) {
			pensionAmount = salary * .05;
		} else {
			pensionAmount = 0;
		}

		return pensionAmount;
	}
	public void gettingPromoted ( double performanceStar){
		if (performanceStar == 5 || performanceStar >= 4.0) {
			System.out.println("Congratulations!!!You will be promoted next years");
		} else {
			System.out.println("Work Harder...");
		}
	}

	@Override
	public int employeeId () {
		return employeeId;
	}

	@Override
	public String employeeName () {
		return employeeName;
	}

	@Override
	public void assignDepartment () {
		this.assignedDepartment = assignedDepartment;
	}

	@Override
	public double calculateSalary () {
		double calculatedSalary = salary + calculateEmployeeBonus(salary, performanceStar);
		System.out.println("Salary with added bonus is " + calculatedSalary);
		return calculatedSalary;
	}

	@Override
	public void benefitLayout () {
		System.out.println(employeeName + " receives bonus of " + calculateEmployeeBonus(EmployeeInfo.getSalary(), 100));
		System.out.println(employeeName + " gets 10 days of paid vacation");
	}

	@Override
	public int getEmployeeAge() {
		return 0;
	}

	@Override
	public int sickLeaveTaken() {
		return 0;
	}

	@Override
	public int sickLeaveRemaining() {
		return 0;
	}


	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
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
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}