package oca.test.methods;

public class Initializers {
	
	static final String puppy;
	static String kitten;
	static String mouse;
	String fish;
	final String hamster;
	
	int age;
	
	static {puppy = "Fred";}   // puppy is static but final so can only be set in the line it is declared or a static. cannot be set in an instance as instance initializers are run each time the object is constructed
	{kitten = "Mr Whiskers";}   // static can be set in an instance
	static {mouse = "Jerry";}	// static can be set in an static
	{fish = "Bob";}			// must be initializer, instance cannot be set in a static
	{hamster = "Dave";}
	
	public Initializers(int age){
		this.age = age;
	}
	
	public static void main(String[] args){
		Initializers init = new Initializers(2);
		System.out.println(init.age);
	}

}
