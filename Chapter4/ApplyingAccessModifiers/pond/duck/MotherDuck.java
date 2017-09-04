package pond.duck;
// Default (Package Private) Access

public class MotherDuck {
	String noise = "quack";
	
	void quack(){
		System.out.println(noise);
	}
	
	private void makeNoise(){
		quack();
	}

}
