package oca.test.statements;

public class Loops {
	
	public static void main(String args[]){
		int x = 5;
		int y = 3;
		
		System.out.println("Initial value of x: " + x);
		System.out.println("Initial value of y: " + y);
		
		while(y > 0){
			System.out.println("Start of while");
			if (x <= 3) 
				{
				
					System.out.println("Entering if x < 2. Current value of x: " + x);				
					System.out.println("Entering if x < 2. Current value of y: " + y);
					
					System.out.println("Calling continue. Leaving if x < 2");

					continue;
					
				}
			
			x--; y--;
			
			System.out.println("Current value of x: " + x);
			System.out.println("Current value of y: " + y);

		}
		
	}

}
