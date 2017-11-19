package oca.test.methods.protected2;

import oca.test.methods.protected1.*;

public class Manager extends Employee {
	
	public void checkPay(){
		printSalary();
		System.out.println(salary);
	}
	
	public void haveManagerMeeting(){
		Manager other = new Manager();
		other.printSalary();                    // Manager inherits from Employee ok to use method
		System.out.println(other.salary);		// Manager inherits from Employee ok to use field
	}
	
	/*
	public void haveEmployeeMeeting(){
		Employee other = new Employee();
		other.printSalary();					// Employee in a different package and does not inherit from Employee not ok to use method
		System.out.println(other.salary);		// Employee in a different package and does not inherit from Employee not ok to use method
	}
	 */
	
}
