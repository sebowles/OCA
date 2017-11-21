package oca.test.classdesign.methodhiding;

public class SportsCar extends Car {
	
	public static int getSpeed(){
		return 120;
	}
	
	/*
	public void accelerate(){
		System.out.println("Car Accelerating!!! " + getSpeed());
	}
	*/
	
	public void turboAccelerate(){
		System.out.println("Sports Car Accelerating!!! " + getSpeed());
	}
	
	public static void main(String[] args){
		Car maserati = new SportsCar();
		System.out.println(maserati.getSpeed());
		maserati.accelerate();
//		maserati.turboAccelerate();
	}

}
