
public class LogicalComplementAndNegationOperators {
	
	public static void main(String args[]){
		boolean x = false;
		System.out.println(x); // false
		x=!x;
		System.out.println(x); // true
		
		double x2 = 1.21;
		System.out.println(x2); // 1.21
		x2 =-x2;
		System.out.println(x2); // -1.21
		x2 = -x2;
		System.out.println(x2); // 1.21
		
//		int x = !5;		// DOES NOT COMPILE
//		boolean y = -true;		// DOES NOT COMPILE
//		boolean z = !0;		// DOES NOT COMPILE
	}

}
