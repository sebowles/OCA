package oca.test.basics;

public class Primitives {
	
	short s = 1;
	final short s2 = 1;
	
	char c = (char) s;
	char c2 = 'a';
	
	// assigning short to int is fine
	int i = s;
	
	// assigning char to int is fine
	int i2 = c2;
	
	byte b = (byte) s;
	
	byte b2 = s2;
	
	float f = 1;
	float f2 = (float) 1.5;
	
	int i3 = (int) f;
	
	int i4 = 1;
	short s3 = (short) i4;
	
	short x = 6;
	short y = 3;
	short z = (short) (x % y);
	
	int i5 = 5;
	final int i6 = 6;
	
	// can only assign int to char through cast or if int is final
	char c3 = (char) i5;
	// implicit narrowing from int to char as int is final
	{c3 = i6;}

	
	
	
	public static void main(String[] args){
		int i5 = 5 & 6;
		System.out.println(i5);
		
        Integer wi = new Integer(1);
//      Long wl = new Long(1);
        Integer wi2 = new Integer(1);
       
        if(wi.equals(1)){
               System.out.println("Numbers are equal");
        }
        else{
               System.out.println("Match could not be made due to different data types");
        }
		
	}

}
