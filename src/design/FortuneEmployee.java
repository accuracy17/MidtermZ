package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
		public static void main(String[] args) {

			EmployeeInfo employeeInfo = new EmployeeInfo(321);
            employeeInfo.setEmployeeId(321);
			employeeInfo.setName("Mark");
			employeeInfo.setEmployeeAge(34);
			employeeInfo.setPerformance(8);
			employeeInfo.setSalary(7300.0);
			employeeInfo.calcSalary();

            EmployeeInfo employee1Info = new EmployeeInfo(654);
            employee1Info.setEmployeeId(654);
            employee1Info.setName("John");
            employee1Info.setEmployeeAge(42);
            employee1Info.setPerformance(9);
            employee1Info.setSalary(7600.0);
            employee1Info.calcSalary();



		}
		


}
