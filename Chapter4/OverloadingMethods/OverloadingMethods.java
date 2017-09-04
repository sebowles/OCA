
public class OverloadingMethods{
	
	public void fly(int numMiles){
		
	}
	
	public void fly(short numFeet){
		
	}
	
	public boolean fly(){
		
		return false;
		
	}
	
	void fly(int numMiles, short numFeet){
		
	}
	
	public void  fly(short numFeet, int numMiles) throws Exception{
		
	}
	
	/*
	public int fly(int numMiles){   // DOES NOT COMPILE
		
	}
	
	
	public static void fly(int numMiles){   // DOES NOT COMPILE
		
	}
	*/
	
	public void fly(int[] lengths){
		
		
	}
	
	/*
	public void fly(int... lengths){   // DOES NOT COMPILE
		
	}
	 */
	
	public void fly(Integer numMiles){
		
	}
}
