
class NoMoreCarrotsException extends Exception {}

public class Bunny{
	
	/*
	public static void main(String[] args){
		eatCarrot(); // DOES NOT COMPILE
	}
	
	
	public static void main(String[] args) throws NoMoreCarrotsException{ // declare exception
		eatCarrot();
	}
	*/
	
	public static void main(String[] args){
		try{
			eatCarrot();
		}
		catch(NoMoreCarrotsException e){// handle exception
			System.out.print("sad raddit");
		}
	}
	
	
	
	
	private static void eatCarrot() throws NoMoreCarrotsException{
	}

}
