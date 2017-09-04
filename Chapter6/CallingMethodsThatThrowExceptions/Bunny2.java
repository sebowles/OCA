class NoMoreCarrotsException extends Exception {}

public class Bunny2 {
	
	public void bad(){
		try{
			eatCarrot();
		}catch(NoMoreCarrotsException e){ // DOES NOT COMPILE
			System.out.print("sad rabbit");
		}
	}
	
	public void good() throws NoMoreCarrotsException{
		eatCarrot();
	}
	
	private static void eatCarrot(){}

}
