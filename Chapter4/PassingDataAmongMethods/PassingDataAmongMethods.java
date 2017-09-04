
public class PassingDataAmongMethods {
	
	public static void main(String[] args){
		int num = 4;
		newNumber(5);
		System.out.println(); 	// 4
	}
	
	public static void newNumber(int num){
		num = 8;
	}

}
