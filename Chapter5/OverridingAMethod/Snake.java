
public class Snake extends Reptile {
	
	protected boolean hasLegs(){
		return false;
	}
	
	protected double getWeight() throws InsufficientDataException{
		return 2;
	}
	
	/*
	protected double getHeight() throws Exception {  // DOES NOT COMPILE
		return 2;
	}
	
	
	protected int getLength() throws InsufficientDataException {  // DOES NOT COMPILE
		return 10;
	}
	*/

}
