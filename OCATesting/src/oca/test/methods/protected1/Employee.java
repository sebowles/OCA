package oca.test.methods.protected1;

public class Employee {
	protected String name;
	protected int age;
	protected double salary = 1000;
	
	protected void printSalary(){
		System.out.println("Employee earns: " + salary);
	}

}
