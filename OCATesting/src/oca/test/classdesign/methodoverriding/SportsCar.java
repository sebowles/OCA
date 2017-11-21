package oca.test.classdesign.methodoverriding;

public class SportsCar extends Car {
	
	public int getSpeed(){
		return 120;
	}
	
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
