
public class TernaryOperator {
	
	public static void main(String[] args){
		int y = 10;
		
		/*
		final int x;
		
		if(y>5){
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		*/
		
		int x = (y > 5) ? (2 * y) : (3 * y);
		
		System.out.println((y > 5) ? 21 : "Zebra");
//		int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE
		
		/* As of Java 7, only one of the righ-hand expressions of the ternary
		 * operator will be evaluated at runtime. In a manner similar to the
		 * short-circuit operators, if onr of the two right-hand expressions
		 * in a ternary operator performs a side effect, then it may not be applied
		 * at runtime. Let's illustrate this principle with the following example
		 */
		
		int y2 = 1;
		int z2 = 1;
		final int x2 = y2<10 ? y2++ : z2++;
		System.out.println(y2+","+z2);  // Outputs 2,1
		
		
		int y3 = 1;
		int z3 = 1;
		final int x3 = y3>=10 ? y3++ : z3++;
		System.out.println(y3+","+z3); // Outputs 1,2
		
	}

}
