package understanding.polymorphism;

public class Lemur extends Primate implements HasTail {
	/* Once the object has been assigned a new reference type,
	   only the methods and variables available to that reference type
	   are callable on the object without an explicit cast */
	
	public boolean isTailStriped(){
		return false;
	}
	
	public int age = 10;
	public static void main(String[] args){
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
	}
	
	

}
