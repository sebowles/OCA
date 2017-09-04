
public class UsingAnArray {

	public static void main(String[] args) {
		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length); 	 // 3
		System.out.println(mammals[0]); 	// monkey
		System.out.println(mammals[1]); 	// chimp
		System.out.println(mammals[2]); 	// donkey
		
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = i + 5;
		
		numbers[10] = 3;
		numbers[numbers.length] = 5;
		for(int i = 0; i <= numbers.length; i++)
			numbers[i] = i + 5;
		
	}

}
