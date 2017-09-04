
public class CreatingAnArrayWithReferenceVariables {

	public static void main(String[] args) {
		String [] bugs = {"cricket", "beetle", "ladybug"};
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); 	// true
		System.out.println(bugs.toString()); 	// [Ljava.lang.String;@160bc7c0
		
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againString = (String[]) objects;
//		againStrings[0] = new StringBuilder();	// DOES NOT COMPILE
		objects[0] = new StringBuilder();		// careful!

	}

}
