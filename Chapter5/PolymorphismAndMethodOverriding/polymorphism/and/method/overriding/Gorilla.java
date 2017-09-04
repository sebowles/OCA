package polymorphism.and.method.overriding;

public class Gorilla extends Animal {
	protected String getName() { // DOES NOT COMPILE
		return "Gorilla";
	}

}
