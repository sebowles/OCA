package oca.test.classdesign.methodhiding;

public class StaticFinalHideTest {
	
	static final int numberCruncher(){
		return 5;
	}

}


class StaticFinalHideTestSub extends StaticFinalHideTest{
	
	/* cannot override final method from StaticFinalHideTest
	static final int numberCruncher(){
		return 7;
	}
	*/
}
