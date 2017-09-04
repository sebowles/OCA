
public class ImmutableSwan {
	private int numberEggs;
	public int getNumberEggs(){
		return numberEggs;
	}
	
	public ImmutableSwan(int numberEggs){
		if(numberEggs >= 0)
			this.numberEggs = numberEggs;
	}

}
