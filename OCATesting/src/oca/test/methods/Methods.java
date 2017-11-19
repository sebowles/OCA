package oca.test.methods;

public class Methods {
	
static int x;

	public static void main(String[] args) {
		System.out.print("Yo!");
		
		{
			System.out.print("Yeeha!");
		}
		
		int y;
		System.out.print(x);
//		System.out.print(y);    // local y not initialized

	}
	
	public int returnTest(int b){
		int a = 0;
		
		if(b > 5)
			return a;
		
		return a;	// this line is required as previous return is within an if statement
		
	}
	
}
