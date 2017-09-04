
public class IfThenElseStatement {
	
	public static void main(String[] args){
		
		int hourOfDay = 0;
		
		if(hourOfDay < 11){
			System.out.println("Good Morning");
		}
		
		if(hourOfDay >= 11){
			System.out.println("Good Afternoon");
		}
		
		if(hourOfDay < 11){
			System.out.println("Good Morning");
		} else if(hourOfDay < 15){
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
		
		if(hourOfDay < 15){
			System.out.println("Good Afternoon");
		} else if(hourOfDay < 11){
			System.out.println("Good Morning");  // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}
		
		
	}

}
