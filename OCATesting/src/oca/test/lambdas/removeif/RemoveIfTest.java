package oca.test.lambdas.removeif;

import java.util.*;

public class RemoveIfTest {

	public static void main(String[] args) {
		
		System.out.println("=========================");
		System.out.println("Testing a list of Strings");
		System.out.println("=========================");
		List<String> zoo = new ArrayList<>();
		
		zoo.add("Lion");
		zoo.add("Elephant");
		zoo.add("Monkey");
		zoo.add("Giraffe");
		zoo.add("Kangaroo");
		
		System.out.println(zoo);
		
		zoo.removeIf(s -> s.charAt(1) == 'i');
		
		System.out.println("=========================");
		System.out.println("List after removeIf");
		System.out.println("=========================");
		
		System.out.println(zoo);
		
		System.out.println();
		
		System.out.println("=========================");
		System.out.println("Testing a list of Integers");
		System.out.println("=========================");
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(50);
		numbers.add(32);
		numbers.add(99);
		numbers.add(180);
		
		System.out.println(numbers);
		
		numbers.removeIf(n -> n > 75);

		System.out.println("=========================");
		System.out.println("List after removeIf");
		System.out.println("=========================");
		
		System.out.println(numbers);
		
		System.out.println();
		
		System.out.println("=========================");
		System.out.println("Testing a list of Colours");
		System.out.println("=========================");
		
		List<String> colours = new ArrayList<>();
		
		colours.add("Red");
		colours.add("Black");
		colours.add("Brown");
		colours.add("Yellow");
		colours.add("Purple");
		colours.add("White");
		colours.add("Brown");
		
		System.out.println(colours);
		
		colours.removeIf(c -> c.equals("Brown"));
		
		System.out.println("=========================");
		System.out.println("List after removeIf");
		System.out.println("=========================");
		
		System.out.println(colours);

	}

}
