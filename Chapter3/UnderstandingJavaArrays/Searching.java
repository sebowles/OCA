import java.util.Arrays;

public class Searching {

	public static void main(String[] args) {
		/* Java provies a convenients way to search - but only if the array is already
		 * sorted.
		 * 
		 * Scenario											Result
		 * ========											======
		 * Target element found in sorted array				Index of match
		 * 
		 * Target element not found in sorted array			Negative value showing one smaller than
		 * 													the negative of index, where a match needs
		 * 													to be inserted to preserve sorted order
		 * 
		 * Unsorted array									A surprise - this result isn't predictable
		*/
		
		int[] numbers = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numbers, 2));	// 0
		System.out.println(Arrays.binarySearch(numbers, 4));	// 1
		System.out.println(Arrays.binarySearch(numbers, 1));	// -1
		System.out.println(Arrays.binarySearch(numbers, 3));	// -2
		System.out.println(Arrays.binarySearch(numbers,  9));	// -5
		
		int[] numbers2 = new int[] {3, 2, 1};
		System.out.println(Arrays.binarySearch(numbers2, 2));
		System.out.println(Arrays.binarySearch(numbers2, 3));
	}

}
