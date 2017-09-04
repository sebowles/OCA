
public class TheForEachStatement {
	
	public static void main(String args[]){
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
			System.out.print(name + ", ");
		}
		
		
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String value : values) {
			System.out.print(value + ", ");
		}
		
		String names2 = "Lisa";
		for(String name : names2) { // DOES NOT COMPILE
			System.out.print(name + " ");
		}
		
		String[] names3 = new String[3];
		for(int name : names3) {	// DOES NOT COMPILE
			System.out.print(name + " ");
		}
		
		java.util.List<String> names4 = new java.util.ArrayList<String>();
		names4.add("Lisa");
		names4.add("Kevin");
		names4.add("Roger");
		for(int i=0; i< names4.size(); i++){
			String name = names4.get(i);
			if(i>0){
				System.out.print(", ");
			}
			System.out.print(name);
		}
		
		// it is common to use a standard for loop over a for-each loop
		// if comparing multiple elements in a loop within a single iteration
		int[] values2 = new int[3];
		values2[0] = 10;
		values2[1] = new Integer(5);
		values2[2] = 15;
		for(int i = 1; i < values2.length; i++) {
			System.out.print(values2[i]-values2[i-1]);
		}
	
	}

}
