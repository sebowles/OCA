
public class UsingATryStatement {
	
	void explore(){
		
		try{
			fall();
			System.out.println("never get here");
		}catch (RuntimeException e){
			getUp();
		}
		
		seeAnimals();
		
	}
	
	void fall(){throw new RuntimeException();}
	
	void getUp(){}
	
	void seeAnimals(){}

}
