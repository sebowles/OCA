
public class TheBasicForStatement {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
			System.out.print(i + " ");
		}
		
		// 2. Adding Multiple Terms to the for Statement
		int x = 0;
		for(long y= 0, z = 4; x < 5 && y < 10; x++, y++){
			System.out.print(y + " ");
		}
		System.out.print(x);
		
		// 3. Redeclaring a Variable in the Initialization Block
		/*
		int x2 = 0;
		for(long y = 0, x2 = 4; x < 5 && y < 10; x2++, y++){   // DOES NOT COMPILE
			System.out.print(x + " ");
		}
		*/
		int x2 = 0;
		long y2 = 10;
		for(y2 = 0, x2 = 4; x2 < 5 & y2 < 10; x2++, y2++){
			System.out.print(x2 + " ");
		}
		
		// 4. Using Incompatible Data Types in the Initialization Block
		for(long y = 0, int x = 4; x < 5 && y < 10; x++, y++){	// DOES NOT COMPILE
			System.out.print(x + " ");
		}
		
		// 5. Using Loop Variables Outside the Loop
		for(long y = 0, x3 = 4; x3 < 5 && y < 10; x3++, y++){
			System.out.print(y + " ");
		}
		System.out.print(x3);
		
		// 1. Creating an Infinite Loop
		for( ; ; ){
			System.out.println("Hello World");
		}
		
	}

}
