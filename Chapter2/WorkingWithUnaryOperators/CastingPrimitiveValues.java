
public class CastingPrimitiveValues {
	
	public static void main(String[] args){
		int x = (int) 1.0;
		short y = (short) 1921222;  // Stored as 20678
		int z = (int) 9l;
		long t = 192301398193810323L;
		
		// short values are automatically promoted to int when
		// applying any arithmetic operator, with the resulting
		// value being of type int
		short x2 = 10;
		short y2 = 3;
//		short z2 = x2 * y2; 	// DOES NOT COMPILE
		short z2 = (short) (x2 * y2);
		
		
	}

}
