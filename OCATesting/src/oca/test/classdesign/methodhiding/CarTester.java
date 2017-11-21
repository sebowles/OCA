package oca.test.classdesign.methodhiding;

public class CarTester {
	
	public static void main(String[] args){
		Car a = new Car();		
		SportsCar b = new SportsCar();
		Car c = new SportsCar();
		
		a.accelerate();
		b.accelerate();
		c.accelerate();
		
	}

}
