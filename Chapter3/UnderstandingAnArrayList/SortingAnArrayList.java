import java.util.Collections;
import java.util.*;

public class SortingAnArrayList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers); 	// [5, 81, 99]

	}

}