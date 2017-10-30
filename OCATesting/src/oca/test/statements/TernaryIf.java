package oca.test.statements;

public class TernaryIf {
	
	public static void main(String[] args){
		String tiger = "Tiger";
		String lion = "Lion";
		final String statement = 250 > 338 ? lion : (tiger = "is Bigger");
		System.out.println(statement);
		
		int a = 1;
		int b = 2;
		int c = a > b ? b : b + 2;
		System.out.println(c);
		

		
	}


}
