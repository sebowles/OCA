package pond.duck;
//Protected Access

import pond.goose.Goose;

public class GooseWatcher {
	
	/* GooseWatcher is not in the same packagae as Bird, nor does it extend Bird.
	 * Goose extends Bird.
	 * That only lets Goose refer to floatInWater() and not callers of Goose
	 * 
	 */
	
	public void watch(){
		Goose goose = new Goose();
//		goose.floatInWater();		// DOES NOT COMPILE
	}

}
