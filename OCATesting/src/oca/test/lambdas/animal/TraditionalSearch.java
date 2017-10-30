package oca.test.lambdas.animal;

import java.util.*;

public class TraditionalSearch {
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		System.out.println("Animals that hop");
		System.out.println("================");
		print(animals, a -> a.canHop()); // pass class that does check
		System.out.println();
		
		System.out.println("Animals that swim");
		System.out.println("=================");
		print(animals, a -> a.canSwim()); // pass class that does check
		
		}
	
		private static void print(List<Animal> animals, CheckTrait checker) {
			
			for (Animal animal : animals) {
				if (checker.test(animal)) // the general check
					System.out.print(animal + " ");
				}
				System.out.println();
		}

}
