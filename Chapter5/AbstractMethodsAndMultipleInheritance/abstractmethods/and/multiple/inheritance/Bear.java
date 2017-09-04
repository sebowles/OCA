package abstractmethods.and.multiple.inheritance;

public class Bear implements Herbivore, Omnivore {
	/*
	public void eatMeat(){
		System.out.println("Eating meat");
	}
	
	
	public int eatPlants(int quantity){
		System.out.println("Eating plants: " + quantity);
		return quantity;
	}
	*/
	
	public int eatPlants(){   // DOES NOT COMPILE
		System.out.println("Eating plants: 10");
		return 10;
	}
	
	
	public void eatPlants(){  // DOES NOT COMPILE
		System.out.println("Eating plants");
	}
	
	


}
