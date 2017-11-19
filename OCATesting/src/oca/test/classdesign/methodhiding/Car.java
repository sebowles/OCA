package oca.test.classdesign.methodhiding;

public class Car {
	
	public static int getSpeed(){
		return 70;
	}
	
	public void accelerate(){
		System.out.println("Car Accelerating!!! " + getSpeed());
	}

}
