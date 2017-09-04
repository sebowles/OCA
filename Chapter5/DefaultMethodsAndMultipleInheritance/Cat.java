
public class Cat implements Walk, Run {  
	
	// IF BELOW METHOD IS NOT OVERRIDDEN CODE WILL NOT COMPILE
	public int getSpeed(){
		return 1;
	}
	
	
	public static void main(String[] args){
		System.out.println(new Cat().getSpeed());
	}

}
