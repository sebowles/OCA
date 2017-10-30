package oca.test.statements;

public class SwitchesEnums {
	
	public enum Planets {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE}
	
	public static void main(String args[]){
		
		Planets p = Planets.values()[2];
	    
		switch(p){
		default:
			System.out.println("Sun");
			break;
		case MERCURY:
			System.out.println("Mercury");
			break;
		case VENUS:
			System.out.println("Venus");
			break;
		case EARTH:
			System.out.println("Earth");
			break;
		case MARS:
			System.out.println("Mars");
			break;
		case JUPITER:
			System.out.println("Jupiter");
			break;
		case SATURN:
			System.out.println("Saturn");
			break;
		case URANUS:
			System.out.println("Uranus");
			break;
		case NEPTUNE:
			System.out.println("Neptune");
			break;
		}
		
		
		
	}

}
