
public class CompoundAssignmentOperators {
	
	public static void main(String args[]){

		int x = 2, z = 3;
		x = x * z;  // Simple assignment operator 
		x *= z;		// Compound assignment operator
		// The left hand side of the compound operator can only be applied to 
		// a variable that is already defined and cannot be used to declare 
		// a new variable. In the previous example, if x was not already 
		// defined, the the expression x *= z would not compile
		
		long x2 = 10;
		int y2 = 5;
//		y2 = y2 * x2;  // DOES NOT COMPILE
		y2 *= x2;
		// The compound operator will first cast x to a long, apply the multiplication of two long
		// values, and then cast the result to an int. Unlike the previous example, in which
		// the complier threw an exception, in this example we see that the compiler will automatically
		// cast the resulting value to the data type of the value on the left-hand side of the compound
		// operator
		
		// The result of the assignment is an expression in and of itself, equal to the value of the assignment
		long x3 = 5;
		long y3 = (x3=3);
		System.out.println(x3);  // Outputs 3;
		System.out.println(y3);  // Also, outputs 3;
		
		
	}

}
