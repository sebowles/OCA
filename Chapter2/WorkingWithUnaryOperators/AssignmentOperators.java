
public class AssignmentOperators {
	
	public static void main(String args[]){
		
		// Java will automatically promote from smaller to larger data types
		// but it will throw a compiler exception if it detects you are
		// trying to convert from larger to smaller data types
		int x = 1.0;  			// DOES NOT COMPILE
		short y = 1921222;		// DOES NOT COMPILE
		int z = 9f;				// DOES NOT COMPILE
		long t = 192301398193810323;	// DOES NOT COMPILE
	}

}
