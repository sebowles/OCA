import java.io.File;

public class EqualityOperators {

	public static void main(String[] args) {
		
		// The equality operators are used in one of three scenarios
		// 1. Comparing two numerica primitive types. If the numeric value are of 
		// different data types, the values are automatically promoted. For example,
		// 5 == 5.00 returns true since the left side is promoted to a double.
		// 2. Comparing two boolean values.
		// 3. Comparing two objects, including null and String values.
		
		// The comparisons for equality are limited to these three cases, so you cannot mix and match types. For
		// example, each of the following would result in a compiler error
		boolean x = true == 3;  			// DOES NOT COMPILE
		boolean y = false != "Giraffe";		// DOES NOT COMPILE
		boolean z = 3 == "Kangaroo";		// DOES NOT COMPILE
		
		boolean y2 = false;
		boolean x2 = (y2 = true);
		System.out.println(x2);		// Outputs true
		
		// For object comparison, the equality operator is applied to the references to the objects
		// not the objects they point to. Two references are equal if and only if they point to the same
		// object, or both point to null.
		File x3 = new File("myFile.txt");
		File y3 = new File("myFile.txt");
		File z3 = x3;
		System.out.println(x3 == y3);  		// Outputs false	
		System.out.println(x3 == z3);		// Outputs true

	}

}
