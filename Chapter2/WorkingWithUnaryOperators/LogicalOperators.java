
public class LogicalOperators {

	public static void main(String[] args) {
		
		// Logical Operators, &, | and ^
		// AND is only true if both operands are true
		// Inclusive OR is only false if both operands are false
		// Exclusive OR is only true if the operands are different
		
		// Conditional Operators, && and ||
		// Nearly identical to the logical operators & and |, respectively, except that the right-hand
		// side of the expression may never be evaluated if the final result can be determined by 
		// the left-hand side of the expression
		
		int x = 6;
		boolean y = (x >= 6) || (++x <= 7);
		System.out.println(x);
		
	}

}
