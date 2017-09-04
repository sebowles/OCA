
public class UnderstandingEquality {

	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); 	// false
		System.out.println(one == three); 	// true
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); 	// true
		
		String x2 = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x2 == z); 	// false
		
		String x3 = new String("Hello World");
		String y2 = "Hello World";
		System.out.println(x == y); 	// false
		
		System.out.println(x2.equals(z)); 	// true
		
		/* String implements a standard method called equals to check the values inside
		 * the String rather than the String itself.
		 * If a class doesn't have an equals method, Java determines whether the references
		 * point to the same object - which is exactly what == does.
		 * StringBuilder does not implement equals(). If you call equals() on two StringBuilder
		 * instances, it will check for reference equality
		 */
		
	}

}
