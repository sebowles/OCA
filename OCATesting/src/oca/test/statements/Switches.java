package oca.test.statements;

import java.util.*;

public class Switches {
	
	/* ************************************
	 * 
	 * Data types for switch statements:
	 * 
	 * byte & Byte
	 * short & Short
	 * char & Character
	 * int & Integer
	 * String
	 * enum
	 * 
	 *  
	 *  Values for case statement:
	 *  
	 *  Compile-time constant values of the same
	 *  data type as the switch value ie.:
	 *  Literals
	 *  enum constants
	 *  final constant variables
	 * 
	 * ************************************/
	

	static List <String> seasons = new ArrayList();
	
	static final int springConstant = 0;
	static final int summerConstant = 1;
	static final int autumnConstant = 2;
	static final int winterConstant = 3;
	
	static {
		seasons.add("Spring");
		seasons.add("Summer");
		seasons.add("Autumn");
		seasons.add("Winter");
	}
	
	static String defaultSeason = "Season";
	
	public static void missingBreaksWithLiteralIntCasesTest(int aSeason){
	    
		switch(aSeason){
		
		case 0:
			System.out.println(seasons.get(0));
		case 1:
			System.out.println(seasons.get(1));
		default:
			System.out.println(defaultSeason);
		case 2:
			System.out.println(seasons.get(2));
			break;
		case 3:
			System.out.println(seasons.get(3));
			break;
		}
		
	}
	
	public static void finalConstantCaseTest(int aSeason){
	    
		switch(aSeason){
		
		case springConstant:
			System.out.println(seasons.get(0));
		case summerConstant:
			System.out.println(seasons.get(1));
		default:
			System.out.println(defaultSeason);
		case autumnConstant:
			System.out.println(seasons.get(2));
			break;
		case winterConstant:
			System.out.println(seasons.get(3));
			break;
		}
		
	}
	

}
