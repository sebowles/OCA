
public class CatchingVariousTypesOfExceptions {
	
	public void visitPorcupine(){
		
		try{
			seeAnimal();
		}catch(AnimalsOutForAWalk e){ // first catch block
			System.out.print("try back later");
		}catch(ExhibitClosed e){ // second catch block
			System.out.print("not today");
		}
		
	}
	
	
	public void visitMonkeys(){
		
		try{
			seeAnimal();
		}catch(ExhibitClosedForLunch e){ // subclass exception
			System.out.print("try back later");
		}catch(ExhibitClosed e){ // superclass exception
			System.out.print("not today");
		}
		
	}
	
	
	void seeAnimal(){}
	
}


class AnimalsOutForAWalk extends RuntimeException{}
class ExhibitClosed extends RuntimeException{}
class ExhibitClosedForLunch extends ExhibitClosed{}
