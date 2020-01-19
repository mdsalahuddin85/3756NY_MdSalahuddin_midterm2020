package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) {

		EmployeeInfo employee1 = new EmployeeInfo("John Doe", 001, "HR", 60000.99, 'M');
		System.out.println(EmployeeInfo.calculateEmployeeBonus(60000.99, 100));
		employee1.benefitLayout();
		System.out.println();

		EmployeeInfo employee2 = new EmployeeInfo("William Holms", 002, "Accounts", 50000.99, 'M');
		System.out.println(employee2.getCOMPANY_ADDRESS());

		EmployeeInfo employee3 = new EmployeeInfo("Lily Smith", 003, "Marketing", 50000.99, 'F');
		System.out.println(employee3.isEmployeeOfTheMonth(100));
	}

}
