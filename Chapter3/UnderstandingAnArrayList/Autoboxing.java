import java.util.*;

public class Autoboxing {

	public static void main(String[] args) {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);// [50.5]
		weights.add(new Double(60));   // [50.5, 60.0]
		weights.remove(50.5);		// [60.0]
		double first = weights.get(0);	// 60.0
		
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		int h = heights.get(0);		// NullPointerException
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers);
		
		// As there's already a remove() method that takes an int parameter, Java calls 
		// that method rather than autoboxing.
		// If you want to remove the 2, you can write numbers.remove(new Integer(2)) to 
		// force wrapper class use.

	}

}
