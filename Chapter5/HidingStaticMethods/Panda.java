import abstractmethods.and.multiple.inheritance.Bear;

public class Panda extends Bear{
	
	public static void eat(){
		System.out.println("Panda beat is chewing");
	}
	
	public static void main(String[] args){
		Panda.eat();
	}
	
	/*
	public void sneeze(){  // DOES NOT COMPILE
		System.out.println("Panda beat sneezes quietly");
	}
	
	public static void hibernate(){   // DOES NOT COMPILE
		System.out.println("Panda beat is going to sleep");
	}
	*/

}
