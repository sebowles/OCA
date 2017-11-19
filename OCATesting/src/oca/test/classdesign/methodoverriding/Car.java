package oca.test.classdesign.methodoverriding;

public class Car {
	
	public int getSpeed(){
		return 70;
	}
	
	public void accelerate(){
		System.out.println("Car Accelerating!!! " + getSpeed());
	}

}
