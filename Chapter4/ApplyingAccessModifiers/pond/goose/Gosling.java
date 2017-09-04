package pond.goose;
// Protected Access

import pond.shore.Bird;  // in a different package

public class Gosling extends Bird {
	
	public void swim(){
		floatInWater();   // calling protected member
		System.out.println(text);   // calling protected member
	}

}
