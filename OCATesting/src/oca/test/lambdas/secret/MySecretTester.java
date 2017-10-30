package oca.test.lambdas.secret;

import java.util.List;

public class MySecretTester {

	public static void main(String[] args) {
		
		/*
		MySecret s = new MySecret();	
		String a = "shark";
		String b = "octopus";
		String c = s.test(a, b);
		*/

		String x = "potato";
		String y = "cabbage";
		
		concat(x, y, (a , b) -> a + b);
		concat(x, y, (a , b) -> { String f = a + b; return f.substring(a.length()/2, f.length() - b.length()/2); } );
		
	}
	
	private static void concat(String a, String b, Secret s) {
		
		System.out.println( s.test(a,b) );

	}

}
