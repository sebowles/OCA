import java.util.*;

public class ConvertingBetweenArrayAndList {

	public static void main(String[] args) {
		// Converting a list to an array
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length);  				// 2
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length); 				// 2
		
		// Converting an array to a List
		// The original array and created array backed List are linked.
		// When a change is made to one, it is available in the other.
		// It is a fixed-size list and is also known as a backed List because the
		// array changes with it.
		String[] array = {"hawk", "robin"}; 		// [hawk, robin]
		List<String> list2 = Arrays.asList(array);	// returns fixed size list
		System.out.println(list.size()); 		 	// 2
		list.set(1,  "test");						// [hawk, test]
		array[0] = "new";							// [new, test]
		for (String b : array)
				System.out.print(b + " ");  		// new test
		list.remove(1);								// throws UnsupportedOperation Exception
		
		// asList() takes varargs which let you pass in an array or just type out the String
		// values.	

	}

}
