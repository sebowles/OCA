
public class RelationalOperators {

	public static void main(String[] args) {
		
		// If the two numeric operands are not of the same data type, the smaller
		// one is promoted
		int x = 10, y = 20, z = 10;
		System.out.println(x < y);  // Outputs true
		System.out.println(x <= y);  // Outputs true
		System.out.println(x >= z);  // Outputs true
		System.out.println(x > y);  // Outputs false
		

	}

}
