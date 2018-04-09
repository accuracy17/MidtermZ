package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.

    //assignDepartment assigns employee to departments
    public void assignDepartment();

	// returns employee id.
	public int employeeId();

	//employeeName returns employee name
	public String employeeName();



	//calculates employee salary
	public int calcSalary();

	//benefits
	public void benefits();

}