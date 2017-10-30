package oca.test.statements;

public class SwitchesTester {

	public static void main(String[] args) {
		
		int seasonNotFound = 5;
		int seasonSummer = 1;
		int seasonWinter = 3;
		
		/* *******************************************************
		 * Testing default season using switch without breaks
		 *
		 * *******************************************************/
		System.out.println("Testing default season using switch without breaks");
		Switches.missingBreaksWithLiteralIntCasesTest(seasonNotFound);
		
		System.out.println();
		
		/* *******************************************************
		 * Testing Summer season using switch without breaks
		 *
		 * Default block is executed as it is after Summer case block and
		 * there is no break in Summer case
		 * *******************************************************/
		System.out.println("Testing Summer season using switch without breaks");
		Switches.missingBreaksWithLiteralIntCasesTest(seasonSummer);
		
		System.out.println();
		
		/* *******************************************************
		 * Testing Winter season using switch without breaks
		 *
		 * Default block is not executed as it is before Winter case block
		 * *******************************************************/
		System.out.println("Testing Winter season using switch without breaks");
		Switches.missingBreaksWithLiteralIntCasesTest(seasonWinter);
		
		System.out.println();
		
		/* *******************************************************
		 * Testing Winter season using switch with final constant cases
		 *
		 * *******************************************************/
		System.out.println("Testing Winter season using switch with final constant cases");
		Switches.finalConstantCaseTest(seasonWinter);
		
	}

}
