
public class IncrementAndDecrementOperators {
	
	public static void main(String args[]){
		int counter = 0;
		System.out.println(counter);  // Outputs 0
		System.out.println(++counter);  // Outputs 1
		System.out.println(counter);  // Outputs 1
		System.out.println(counter--);  // Outputs 1
		System.out.println(counter);  // Outputs 0
		
		int x = 3;
		int y = ++x * 5 / x-- + --x;  // x = 2, y = 7
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		
	}

}
