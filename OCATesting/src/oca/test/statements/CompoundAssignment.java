package oca.test.statements;

public class CompoundAssignment {
	
	static int e;
	
	public static void main(String args[]){
		
		int a = 1, b = 2;
		
		a = a + b;
		a += b;
		
//		int c += 4;			 // compound operator cannot be used as c has not already been defined
		
		int d = 4;
		d += 5;
		
		e += 6;
		
		long f = 10;
		int g = 5;
//		g = g * f;     // does not compile as result is promoted to long and trying to assign to an int
		
		g += f;			// compound operator will promote g to long, multiple 2 longs and then case to an int
		
		long h = 2147483648L;
			
	}

}
