package oca.test.methods;

public class InstanceInitialization {
	
	private final String car;
	
	private final static String plane;
	
	private static int classCounter;
	
	{
		System.out.println("Constructing car from Instance Initializer. Class Counter is now: " + classCounter);
		car = "BMW" + classCounter;
	}
	
	static{plane="F-15 Strike Eagle";}
	
	static{
		classCounter++;
		System.out.println("Incrementing Class Counter In Static Initializer. Class Counter is now: " + classCounter);
		}
	
	public InstanceInitialization(){
		System.out.println("Initializing Object");
		classCounter++;
		System.out.println("Incrementing Class Counter In Constructor. Class Counter is now: " + classCounter);
	}
	
	{
		classCounter++;
		System.out.println("Incrementing Class Counter In Instance Initializer. Class Counter is now: " + classCounter);
	}
	
	public static void main(String[] args){
		System.out.println("Starting main method..");
		System.out.println("Plane: " + plane);
		System.out.println("Class Counter: " + classCounter);
		System.out.println();
		
		
		InstanceInitialization init = new InstanceInitialization();
		System.out.println("Init car: " + init.car);
		System.out.println("Class Counter: " + classCounter);
		System.out.println();
		
		InstanceInitialization init2 = new InstanceInitialization();
		System.out.println("Init car: " + init.car);
		System.out.println("Class Counter: " + classCounter);
		System.out.println("Init2 car: " + init2.car);
		System.out.println("Class Counter: " + classCounter);
		
	}

}
