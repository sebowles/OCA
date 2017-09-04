
public class Bunny implements Hop {
	public void printDetails() {
		
		/* As a static method is defined in an interface
		the interface name is required for the static method call */
		System.out.println(Hop.getJumpHeight()); 
	}

}
