package oca.test.methods.protected2;
import oca.test.methods.protected1.*;

public class Cleaner {
	
	public void clean(){
		Employee e = new Employee();   
//		e.printSalary();		// Cleaner in a different package and does not inherit from Employee - not ok to use method
	}

}
