
public interface SharkFamily extends HasFins {
	public default int getNumberOfFins(){
		return 8;
	}
	
	public double getLongetFinLength();
	
	public boolean doFinsHaveScales(){  // DOES NOT COMPILE
		return false;
	}

}
